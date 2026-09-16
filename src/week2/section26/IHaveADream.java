package week2.section26;

import java.util.Scanner;

public class IHaveADream {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a double num:");
        double num = scanner.nextDouble();

        if (num < 120.5) {
            System.out.println("I have a dream");
        }
    }
}
