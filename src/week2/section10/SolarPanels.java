package week2.section10;

import java.util.Scanner;

public class SolarPanels {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int solarIntensity = 1200;
        System.out.println("Please enter the average solar intensity in your region:");

        int userAverageSolarIntensity = scanner.nextInt();
        boolean meetsRequirement = userAverageSolarIntensity >= 1200;
        System.out.println("Your region should install solar panels: " + meetsRequirement);
    }
}
