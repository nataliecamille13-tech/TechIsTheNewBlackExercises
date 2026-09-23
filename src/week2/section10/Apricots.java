package week2.section10;

import java.util.Scanner;

public class Apricots {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int maximumWinds = 30;
        System.out.println("Please enter the maximum wind speed in your region:");

        int userMaximumWindSpeed = scanner.nextInt();
        boolean meetsRequirement = userMaximumWindSpeed <= 30;
        System.out.println("You can grow apricot: " + meetsRequirement);
    }
}
