package week3.section16;

import java.util.Scanner;

public class MonthsOfTheSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a season
        System.out.println("Enter a season:");
        String season = scanner.nextLine().toLowerCase();

        // Use a switch statement to display the months for the selected season
        switch (season) {
            case "spring":
                System.out.println("March");
                System.out.println("April");
                System.out.println("May");
                break;

            case "summer":
                System.out.println("June");
                System.out.println("July");
                System.out.println("August");
                break;

            case "fall":
                System.out.println("September");
                System.out.println("October");
                System.out.println("November");
                break;

            case "winter":
                System.out.println("December");
                System.out.println("January");
                System.out.println("February");
                break;

            default:
                System.out.println("Invalid season. Please enter spring, summer, fall, or winter.");
                break;
        }

        scanner.close();
    }
}

