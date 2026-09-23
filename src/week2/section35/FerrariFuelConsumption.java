package week2.section35;

import java.util.Scanner;

public class FerrariFuelConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance traveled in miles:");
        double distance = scanner.nextDouble();

        System.out.println("Enter the time taken in hours:");
        double time = scanner.nextDouble();

        double averageSpeed = distance / time;

        double milesPerGallon;

        if (averageSpeed <= 60) {
            milesPerGallon = 15;
        } else {
            milesPerGallon = 9;
        }

        double gallonsPerMile = 1.0 / (averageSpeed / milesPerGallon);

        System.out.printf("The average speed was %.2f miles per hour.%n", averageSpeed);
        System.out.printf("The Ferrari used %.2f gallons of fuel per mile.%n", gallonsPerMile);
    }
}
