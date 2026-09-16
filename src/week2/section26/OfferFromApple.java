package week2.section26;

import java.util.Scanner;

public class OfferFromApple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of months actively studied at wedevx.co:");
        int numOfMonths = scanner.nextInt();

        if (numOfMonths >= 6) {
            System.out.println("Congratulations on your offer from Apple");
        }
    }
}
