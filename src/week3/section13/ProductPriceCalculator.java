package week3.section13;

import java.util.Scanner;

public class ProductPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the quantity of the product:");
        double quantity = scanner.nextDouble();

        if (quantity <= 0) {
            System.out.println("Quantity cannot be 0 or less");
        } else {
            System.out.println("Enter the location of the customer (USA/Canada/Other):");
            String location = scanner.next();

            double price = 0;

            if (location.equalsIgnoreCase("USA")) {
                if (quantity < 100) {
                    price = 2.50;
                } else {
                    price = 2.00;
                }
            } else if (location.equalsIgnoreCase("Canada")) {
                if (quantity < 100) {
                    price = 3.00;
                } else {
                    price = 2.50;
                }
            } else if (location.equalsIgnoreCase("Other")) {
                if (quantity < 100) {
                    price = 3.50;
                } else {
                    price = 3.00;
                }
            } else {
                System.out.println("Invalid location");
                scanner.close();
                return;
            }

            double totalCost = price * quantity;
            System.out.println("The total cost of the product is: $" + totalCost);
        }

        scanner.close();
    }
}
