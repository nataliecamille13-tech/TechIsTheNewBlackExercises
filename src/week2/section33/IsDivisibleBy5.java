package week2.section33;

import java.util.Scanner;

public class IsDivisibleBy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.println("The number entered is divisible by 5");
        } else {
            System.out.println("The number entered is not divisible by 5");
        }

        scanner.close();
    }
}
