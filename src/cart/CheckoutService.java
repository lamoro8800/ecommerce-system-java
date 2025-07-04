package cart;

import model.*;
import shipping.*;

import java.util.ArrayList;
import java.util.List;

public class CheckoutService {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) throw new RuntimeException("Cart is empty!");

        double subtotal = 0;
        List<ShippableItem> toShip = new ArrayList<>();

        for (CartItem item : cart.getItems()) {
            Product p = item.product;
            if (p instanceof Expirable && ((Expirable) p).getExpiryDate().isBefore(java.time.LocalDate.now()))
                throw new RuntimeException("Product " + p.getName() + " is expired.");
            if (!p.isAvailable(item.quantity))
                throw new RuntimeException("Product " + p.getName() + " is out of stock.");

            p.reduceQuantity(item.quantity);
            subtotal += item.getTotalPrice();

            if (p instanceof Shippable shippableProduct) {
                String name = item.quantity + "x " + p.getName();
                double weight = shippableProduct.getWeight() * item.quantity;

                toShip.add(new ShippableItem() {
                    public String getName() { return name; }
                    public double getWeight() { return weight; }
                });
            }
        }

        double shippingFees = toShip.isEmpty() ? 0 : ShippingService.calculateTotalWeight(toShip);
        double total = subtotal + shippingFees;

        if (customer.getBalance() < total)
            throw new RuntimeException("Customer has insufficient balance!");

        ShippingService.processShipment(toShip);
        customer.pay(total);

        System.out.println("\n** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.println(item.quantity + "x " + item.product.getName() + " " + item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.println("Subtotal " + subtotal);
        System.out.println("Shipping " + shippingFees);
        System.out.println("Amount " + total);
        System.out.println("Balance after payment: " + customer.getBalance());
    }
}
