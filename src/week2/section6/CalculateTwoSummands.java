package week2.section6;

import java.util.Scanner;

public class CalculateTwoSummands {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println(firstNumber);

        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();
        System.out.println(secondNumber);

        int results = firstNumber + secondNumber;

        System.out.println("The result is " + results);

    }
}
