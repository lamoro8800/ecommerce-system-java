// Scenario: Normal successful checkout
// Expected: Prints shipment and receipt details, deducts customer balance
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



// Scenario: Quantity Exceeds Available Stock
// Expected: RuntimeException -> "Requested quantity exceeds available stock"
// import cart.*;
// import model.*;
// import java.time.LocalDate;

// public class Main {
//     public static void main(String[] args) {
//         Product cheese = new Cheese("Cheese 200g", 100, 5, LocalDate.of(2025, 12, 1), 0.2);
//         Product falamankCheese = new Cheese("Falamank Cheese 500g", 225, 3, LocalDate.of(2026, 3, 15), 0.5);
//         Product tv = new TV("TV", 3000, 2,  10);
//         Product scratchCard = new ScratchCard("Scratch Card", 50, 10);

//         Customer customer = new Customer("Ahmed", 5000);
//         Cart cart = new Cart();
//         cart.add(cheese, 6); // Only 5 in stock → should throw an exception
//         cart.add(falamankCheese, 1);
//         cart.add(scratchCard, 1);

//         CheckoutService.checkout(customer, cart);
//     }
// }


// Scenario: Product is expired
// Expected: RuntimeException -> "Product <name> is expired"
// import cart.*;
// import model.*;
// import java.time.LocalDate;
//
// public class Main {
//     public static void main(String[] args) {
//         Product expiredCheese = new Cheese("Expired Cheese", 80, 2, LocalDate.of(2023, 12, 1), 0.3);
//
//         Customer customer = new Customer("Mona", 1000);
//         Cart cart = new Cart();
//         cart.add(expiredCheese, 1);
//
//         CheckoutService.checkout(customer, cart);
//     }
// }


// Scenario: Customer has insufficient balance
// Expected: RuntimeException -> "Customer has insufficient balance!"
// import cart.*;
// import model.*;
// import java.time.LocalDate;
//
// public class Main {
//     public static void main(String[] args) {
//         Product tv = new TV("TV", 3000, 2, 10);
//
//         Customer customer = new Customer("Omar", 100); // Not enough balance
//         Cart cart = new Cart();
//         cart.add(tv, 1);
//
//         CheckoutService.checkout(customer, cart);
//     }
// }


// Scenario: Cart is empty
// Expected: RuntimeException -> "Cart is empty!"
// import cart.*;
// import model.*;
// import java.time.LocalDate;
//
// public class Main {
//     public static void main(String[] args) {
//         Customer customer = new Customer("Nada", 2000);
//         Cart cart = new Cart(); // No items added
//
//         CheckoutService.checkout(customer, cart);
//     }
// }

