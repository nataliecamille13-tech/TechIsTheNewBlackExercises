package week2.section31;

import java.util.Scanner;

public class TemperatureAdvisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a temperature:");
        double temperature = input.nextDouble();

        if (temperature < 70) {
            System.out.println("Wear a light jacket or long sleeves");
        } else {
            System.out.println("Wear a t-shirt or summer clothing");
        }

        input.close();
    }
}
