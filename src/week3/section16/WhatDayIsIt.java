package week3.section16;

import java.util.Scanner;

public class WhatDayIsIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number between 1 and 7
        System.out.println("Enter a number between 1 and 7:");
        int dayNumber = scanner.nextInt();

        // Use a switch statement to determine the day of the week
        switch (dayNumber) {
            case 1:
                System.out.println("The corresponding day of the week is Sunday");
                break;
            case 2:
                System.out.println("The corresponding day of the week is Monday");
                break;
            case 3:
                System.out.println("The corresponding day of the week is Tuesday");
                break;
            case 4:
                System.out.println("The corresponding day of the week is Wednesday");
                break;
            case 5:
                System.out.println("The corresponding day of the week is Thursday");
                break;
            case 6:
                System.out.println("The corresponding day of the week is Friday");
                break;
            case 7:
                System.out.println("The corresponding day of the week is Saturday");
                break;
            default:
                // Display an error message if the number is outside 1–7
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                break;
        }

        scanner.close();
    }
}
