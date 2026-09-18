package week2.section33;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the current hour in 24-hour format:");
        int hour = scanner.nextInt();

        System.out.println("Please enter the current minute of the hour:");
        int minute = scanner.nextInt();

        String pmOrAm;

        if (hour >= 12) {
            pmOrAm = "PM";
        } else {
            pmOrAm = "AM";
        }

        if (hour == 0) {
            hour = 12;
        } else if (hour > 12) {
            hour -= 12;
        }

        System.out.println("The time in 12-hour format is: " + hour + ":" + minute + " " + pmOrAm);

        scanner.close();
    }
}
