import cart.*;
import model.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product cheese = new Cheese("Cheese 200g", 100, 5, LocalDate.of(2025, 12, 1), 0.2);
        Product falamankCheese = new Cheese("Falamank Cheese 500g", 225, 3, LocalDate.of(2026, 3, 15), 0.5);
        Product tv = new TV("TV", 3000, 2,  10);
        Product scratchCard = new ScratchCard("Scratch Card", 50, 10);

        Customer customer = new Customer("Ahmed", 5000);
        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(falamankCheese, 1);
        cart.add(scratchCard, 1);

        CheckoutService.checkout(customer, cart);
    }
}
