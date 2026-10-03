package week2.section2;

import java.util.Scanner;

public class WhenWillIBeReadyForAJob {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of weeks completed in the course:");
        int weeks = sc.nextInt();

        int remainingWeeks = 24 - weeks;

        System.out.printf("" + remainingWeeks + "");


    }
}
