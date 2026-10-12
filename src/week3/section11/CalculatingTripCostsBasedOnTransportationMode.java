package week3.section11;

import java.util.Scanner;

public class CalculatingTripCostsBasedOnTransportationMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the distance of the trip in miles: ");
        int distanceTraveled = scanner.nextInt();

        System.out.println("Please enter the mode of transportation (drive/fly):");
        String modeOfTransport = scanner.next();

        double totalCost = 0.0;
        boolean isFirstClass = false;

        if (distanceTraveled <= 0) {
            if (modeOfTransport.equals("fly")) {
                System.out.println("Do you want to fly first class (yes/no)?");
                String firstClassChoice = scanner.next();
                isFirstClass = firstClassChoice.equalsIgnoreCase("yes");
            }
            System.out.println("Invalid distance value, please enter a positive value.");
        } else if (modeOfTransport.equalsIgnoreCase("drive")) {
            totalCost = distanceTraveled * 0.50;
            System.out.printf("The cost of the trip is $%.2f%n", totalCost);
        } else if (modeOfTransport.equalsIgnoreCase("fly")) {
            System.out.println("Do you want to fly first class (yes/no)?");
            String firstClassChoice = scanner.next();
            isFirstClass = firstClassChoice.equalsIgnoreCase("yes");

            totalCost = (distanceTraveled / 500.0) * 100.0;

            if (isFirstClass) {
                totalCost += 50.0;
            }

            System.out.printf("The cost of the trip is $%.2f%n", totalCost);
        } else {
            System.out.println("Invalid mode of transportation!");
        }

        scanner.close();
    }
}
