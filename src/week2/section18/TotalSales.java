package week2.section18;

import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sale amount for transaction 1:");
        double total = sc.nextDouble();

        System.out.println("Enter the sale amount for transaction 2:");
        total += sc.nextDouble();

        System.out.println("Enter the sale amount for transaction 3:");
        total += sc.nextDouble();

        System.out.println("Total is " + total);
    }
}
