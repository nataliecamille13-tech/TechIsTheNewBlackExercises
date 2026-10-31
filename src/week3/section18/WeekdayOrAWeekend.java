package week3.section18;

import java.util.Scanner;

public class WeekdayOrAWeekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a day of the week.
        System.out.println("Enter the day of the week:");
        String day = scanner.nextLine();

        // Convert the input to lowercase to handle different capitalization.
        switch (day.toLowerCase()) {
            // Saturday and Sunday are weekend days.
            case "saturday":
            case "sunday":
                System.out.println(day + " is a weekend day");
                break;

            // Monday through Friday are weekdays.
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(day + " is a weekday");
                break;

            // Handle inputs that are not valid days of the week.
            default:
                System.out.println("Invalid day of the week");
                break;
        }

        scanner.close();
    }
}
