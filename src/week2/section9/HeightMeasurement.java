package week2.section9;

import java.util.Scanner;

public class HeightMeasurement {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your current height:");
        double currentHeight = scanner.nextDouble();

        System.out.println("Please enter the average height of their age group:");
        double averageHeight = scanner.nextDouble();

        boolean isTallerThanAverageHeight = currentHeight > averageHeight;
        System.out.println("You are taller than the average height of their age group: " + isTallerThanAverageHeight);
    }
}
