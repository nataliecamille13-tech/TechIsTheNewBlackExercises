package week2.section39;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Annual income:");
        double income = scanner.nextDouble();

        double tax;

        if (income <= 10000) {
            tax = income * 0.05;
        } else if (income <= 50000) {
            tax = income * 0.10;
        } else if (income <= 100000) {
            tax = income * 0.20;
        } else {
            tax = income * 0.30;
        }

        System.out.println("Tax amount: $" + tax);
    }
}
