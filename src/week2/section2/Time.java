package week2.section2;

import java.util.Scanner;

public class Time {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the hour:");
        int hour = sc.nextInt();

        System.out.println("Please enter the minutes:");
        int minutes = sc.nextInt();

        System.out.println("Please enter the seconds:");
        int seconds = sc.nextInt();

        System.out.printf("The current time is %d:%d:%d\n", hour, minutes, seconds);
    }
}
