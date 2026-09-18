package week2.section33;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a three-digit number:");
        int number = scanner.nextInt();

        int firstDigit = number / 100;
        int lastDigit = number % 10;

        if (firstDigit == lastDigit) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }

        scanner.close();
    }
}
