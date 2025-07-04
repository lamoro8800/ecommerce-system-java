# E-commerce System (Java)

A simple, SOLID-principled, object-oriented e-commerce system developed in Java.

## Features

- Define products (Cheese, TV, Scratch Card, etc.) with price, quantity, and optional properties like expiry date or shipping weight.
- Supports shippable and expirable product types using interfaces.
- Customers can:
  - Add products to cart (with quantity checks)
  - Checkout with detailed receipt
  - Handle expired items, out-of-stock items, and insufficient balance
- ShippingService handles shippable items and calculates weight-based fees.

## Checkout Example Output

** Shipment Notice **
- 2x Cheese 200g
- 1x Falamank Cheese 500g
- Total Package Weight: 0.9 kg

** Checkout Receipt **
- 2x Cheese 200g: 200
- 1x Falamank Cheese 500g: 225
- 1x Scratch Card: 50

--------------------------
- Subtotal: 575.0
- Shipping Fee: 9.0
- Total Paid: 584.0
- Remaining Balance: 4416.0

## Technologies

- Java
- IntelliJ IDEA
- Git

## How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/lamoro8800/ecommerce-system-java.git
   ```
2. Open in IntelliJ IDEA or any Java IDE.
3. Run the Main.java class.
