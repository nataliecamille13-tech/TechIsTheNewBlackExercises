package week2.section10;

import java.util.Scanner;

public class Apple {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int minimumRainfall = 40;
        System.out.println("Please enter the average rainfall in your region:");

        int userRainfall = scanner.nextInt();
        boolean meetsRequirement = userRainfall >= minimumRainfall;
        System.out.println("Does it meet the minimum requirement? " + meetsRequirement);
    }
}
