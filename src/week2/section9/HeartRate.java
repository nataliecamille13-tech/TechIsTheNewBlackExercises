package week2.section9;

import java.util.Scanner;

public class HeartRate {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your current heart rate:");
        double currentHeartRate = scanner.nextDouble();

        System.out.println("Please enter the average heart rate for their age group:");
        double averageHeartRate = scanner.nextDouble();

        boolean isLowerThanAverageHeartRate = currentHeartRate < averageHeartRate;
        System.out.println("Your heart rate is lower than the average heart rate for your age group: " + isLowerThanAverageHeartRate);
    }
}
