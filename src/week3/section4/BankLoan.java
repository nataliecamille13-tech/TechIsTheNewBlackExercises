package week3.section4;

import java.util.Scanner;

public class BankLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Checking your credit rating...");
        System.out.println("Enter your credit rating: ");
        int creditRating = scanner.nextInt();

        if (creditRating > 700) {
            System.out.println("Checking your income level...");
            System.out.println("Enter your income: ");
            int income = scanner.nextInt();

            if (income > 50000) {
                System.out.println("Congratulations! Your loan has been approved.");
            } else {
                System.out.println("Sorry, your loan has been denied. Your income is not high enough.");
            }
        } else {
            System.out.println("Sorry, your loan has been denied. Your credit rating is not high enough.");
        }

        scanner.close();
    }
}

