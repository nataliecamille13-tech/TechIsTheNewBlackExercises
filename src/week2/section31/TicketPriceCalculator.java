package week2.section31;

import java.util.Scanner;

public class TicketPriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        int ticketPrice = 10;

        if (age < 14) {
            ticketPrice = ticketPrice / 2;
        }

        System.out.println("Ticket price is $" + ticketPrice);

        input.close();
    }
}
