package week3.section20;

import java.util.Scanner;

public class GoodDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a day of the week.
        System.out.println("Enter a day of the week (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday):");
        String day = scanner.nextLine();

        // Ask the user to enter a time of day.
        System.out.println("Enter the time of day (morning, afternoon, evening):");
        String timeOfDay = scanner.nextLine();

        // Use the outer switch to check the day of the week.
        switch (day.toLowerCase()) {

            // Weekdays
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":

                // Use a nested switch to check the time of day.
                switch (timeOfDay.toLowerCase()) {
                    case "morning":
                        System.out.println("Good morning! It's " + day + "!");
                        break;

                    case "afternoon":
                        System.out.println("Good afternoon! It's " + day + "!");
                        break;

                    case "evening":
                        System.out.println("Good evening! It's " + day + "!");
                        break;

                    default:
                        System.out.println("Invalid time of day");
                        break;
                }
                break;

            // Weekend days
            case "saturday":
            case "sunday":

                // Use a nested switch to check the time of day.
                switch (timeOfDay.toLowerCase()) {
                    case "morning":
                        System.out.println("Good morning! It's the weekend!");
                        break;

                    case "afternoon":
                        System.out.println("Good afternoon! It's the weekend!");
                        break;

                    case "evening":
                        System.out.println("Good evening! It's the weekend!");
                        break;

                    default:
                        System.out.println("Invalid time of day");
                        break;
                }
                break;

            // Handle invalid days of the week.
            default:
                System.out.println("Invalid day of week");
                break;
        }

        scanner.close();
    }
}
