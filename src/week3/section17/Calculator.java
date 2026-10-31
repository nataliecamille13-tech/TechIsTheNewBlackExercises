package week3.section17;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers.
        System.out.println("Enter first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number:");
        double secondNumber = scanner.nextDouble();

        // Read the operator as a string and extract its character.
        System.out.println("Enter operator (+, -, *, /):");
        String operatorInput = scanner.next();
        char operator = operatorInput.charAt(0);

        double result;

        // Use a switch statement to perform the selected operation.
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = firstNumber - secondNumber;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = firstNumber * secondNumber;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;

            default:
                // Display an error message for an invalid operator.
                System.out.println("Error: Invalid operator");
                break;
        }

        scanner.close();
    }
}
