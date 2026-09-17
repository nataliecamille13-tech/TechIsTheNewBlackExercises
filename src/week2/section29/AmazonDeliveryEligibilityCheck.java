package week2.section29;

import java.util.Scanner;

public class AmazonDeliveryEligibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your shipment country:");
        String shipmentCountry = scanner.nextLine();

        System.out.println("Enter your total purchase amount:");
        double totalPurchaseAmount = scanner.nextDouble();

        if (shipmentCountry.equals("USA") ||
                shipmentCountry.equals("Canada") ||
                shipmentCountry.equals("Mexico")) {

            if (totalPurchaseAmount >= 120.00) {
                System.out.println("You are eligible for a free shipment");
            } else {
                double difference = 120.00 - totalPurchaseAmount;
                System.out.println("Spend $" + difference + " more to be eligible for a free shipment");
            }

        } else {
            System.out.println("We currently do not support shipments to " + shipmentCountry);
        }
    }
}
