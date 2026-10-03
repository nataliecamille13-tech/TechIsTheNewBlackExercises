package week2.section3;

import java.util.Scanner;

public class TheRichestManInBabylon {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your monthly income:");
        double monthlyIncome = scanner.nextDouble();

        double savingsPerMonth = monthlyIncome * 0.10;
        double savingsIn6Months = savingsPerMonth * 6;
        double savingsIn12Months = savingsPerMonth * 12;

        System.out.printf("You have to save $%.2f per month which is 10%% of your monthly income\n", savingsPerMonth);
        System.out.printf("In 6 months you will save $%.2f\n", savingsIn6Months);
        System.out.printf("In 12 months you will save $%.2f\n", savingsIn12Months);



    }
}
