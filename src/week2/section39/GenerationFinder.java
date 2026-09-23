package week2.section39;

import java.util.Scanner;

public class GenerationFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year:");
        int year = scanner.nextInt();

        if (year < 1946) {
            System.out.println("Invalid input.");
        } else if (year <= 1964) {
            System.out.println("You belong to the Baby Boomer generation.");
        } else if (year <= 1980) {
            System.out.println("You belong to the Generation X generation.");
        } else if (year <= 1996) {
            System.out.println("You belong to the Millennial generation.");
        } else if (year <= 2012) {
            System.out.println("You belong to the Generation Z generation.");
        } else {
            System.out.println("You belong to the Generation Alpha generation.");
        }
    }
}
