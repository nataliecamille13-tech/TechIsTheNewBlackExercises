package week2.section27;

import java.util.Scanner;

public class NurseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Your Body Temperature:");
        double temperature = scanner.nextDouble();

        if (temperature < 97.7) {
            System.out.println("Drink Some Hot Tea to Warm Up");
        } else if (temperature > 99.5) {
            System.out.println("Take Tylenol to Bring Your Temperature Down");
        }
    }
}
