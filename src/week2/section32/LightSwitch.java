package week2.section32;

import java.util.Scanner;

public class LightSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter true or false to indicate whether the light is on or off:");

        boolean isLightOn = scanner.nextBoolean();

        if (isLightOn) {
            System.out.println("Light is on");
        } else {
            System.out.println("Light is off");
        }

        scanner.close();
    }
}
