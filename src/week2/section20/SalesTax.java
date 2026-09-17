package week2.section20;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the sale amount:");
        double total = scanner.nextDouble();

        System.out.println("Please enter the tax rate:");
        double tax = scanner.nextDouble();

        tax /= 100;
        total += total * tax;

        System.out.println(total);
    }
}
