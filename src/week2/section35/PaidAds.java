package week2.section35;

import java.util.Scanner;

public class PaidAds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter target audience location:");
        String location = scanner.nextLine();

        double pricePerClick;

        if (location.equalsIgnoreCase("United States")) {
            pricePerClick = 1.5;
        } else {
            pricePerClick = 0.5;
        }

        System.out.println("Price per click: $" + pricePerClick);
    }
}
