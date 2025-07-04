package shipping;

import java.util.List;

public class ShippingService {

    // New method: Calculates total weight only
    public static double calculateTotalWeight(List<ShippableItem> items) {
        double totalWeight = 0;
        for (ShippableItem item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight * 10;
    }

    // Uses the method above before printing
    public static void processShipment(List<ShippableItem> items) {
        System.out.println("** Shipment notice **");

        for (ShippableItem item : items) {
            System.out.println("Shipping: " + item.getName());
        }

        double totalWeight = calculateTotalWeight(items);
        System.out.printf("Total package weight %.1fkg%n", totalWeight);
    }
}
