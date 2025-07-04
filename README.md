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
Shipping: 2x Cheese 200g  
Shipping: 1x Falamank Cheese 500g  
Total package weight 9.0kg  

** Checkout Receipt **  
2x Cheese 200g 200.0  
1x Falamank Cheese 500g 225.0  
1x Scratch Card 50.0  

--------------------------  
Subtotal 475.0  
Shipping 9.0  
Amount 484.0  
Balance after payment: 4516.0  



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
