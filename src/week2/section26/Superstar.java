package week2.section26;

import java.util.Scanner;

public class Superstar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an int num:");
        int num = scanner.nextInt();

        if (num > 42) {
            System.out.println("Superstar");
        }
    }
}