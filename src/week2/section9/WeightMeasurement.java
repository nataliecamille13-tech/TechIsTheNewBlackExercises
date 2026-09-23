package week2.section9;

import java.util.Scanner;

public class WeightMeasurement {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your current weight:");
        double currentWeight = scanner.nextDouble();

        System.out.println("Please enter your ideal weight:");
        double idealWeight = scanner.nextDouble();

        boolean isLessThanIdeal = currentWeight < idealWeight;
        System.out.println("Your current weight is less than your ideal weight: " + isLessThanIdeal);

    }
}
