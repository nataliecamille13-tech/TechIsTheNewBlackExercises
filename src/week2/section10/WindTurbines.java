package week2.section10;

import java.util.Scanner;

public class WindTurbines {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int windSpeed = 11;
        System.out.println("Please enter the average wind speed in your region:");

        int userAverageWindSpeed = scanner.nextInt();
        boolean meetsRequirement = userAverageWindSpeed >= 11;
        System.out.println("Your region should install wind turbines: " + meetsRequirement);


    }
}
