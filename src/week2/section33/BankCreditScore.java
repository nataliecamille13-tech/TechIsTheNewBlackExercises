package week2.section33;

import java.util.Scanner;

public class BankCreditScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your credit score?");
        int creditScore = scanner.nextInt();

        if (creditScore > 700) {
            System.out.println("Congratulations, your credit score is good");
        } else {
            System.out.println("Your credit score needs improvement");
        }

        scanner.close();
    }
}
