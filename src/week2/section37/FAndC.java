package week2.section37;

import java.util.Scanner;

public class FAndC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a temperature:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter 'C' for Celsius or 'F' for Fahrenheit:");
        String type = scanner.next();

        if (type.equalsIgnoreCase("C")) {
            double fahrenheit = temperature * 9 / 5 + 32;
            System.out.printf("%.1f Celsius is %.1f Fahrenheit%n", temperature, fahrenheit);
        } else if (type.equalsIgnoreCase("F")) {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("%.1f Fahrenheit is %.1f Celsius%n", temperature, celsius);
        } else {
            System.out.println("Invalid scale. Please enter 'C' or 'F'");
        }
    }
}
