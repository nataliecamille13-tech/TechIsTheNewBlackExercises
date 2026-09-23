package week2.section38;

import java.util.Scanner;

public class TicketPricing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age >= 0 && age <= 3) {
            System.out.println("Children under 3 years old - FREE!");
        } else if (age >= 4 && age <= 7) {
            System.out.println("Children aged 4 to 7 - 50% discount!");
        } else if (age >= 8 && age <= 17) {
            System.out.println("Children aged 8 to 18 - 25% discount!");
        } else if (age >= 18 && age <= 25) {
            System.out.println("Students receive a 50% discount with a valid student ID!");
        } else if (age >= 65) {
            System.out.println("Seniors (65+) receive a 65% discount!");
        } else {
            System.out.println("Regular price applies");
        }
    }
}
