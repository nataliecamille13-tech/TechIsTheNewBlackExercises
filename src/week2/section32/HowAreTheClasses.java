package week2.section32;

import java.util.Scanner;

public class HowAreTheClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are classes ready? true/false");
        boolean isEasy = scanner.nextBoolean();

        if (isEasy) {
            System.out.println("Don't get relaxed, get ready for the next challenges");
        } else {
            System.out.println("Don't give up! You will succeed as long as you don't quit");
        }

        scanner.close();
    }
}