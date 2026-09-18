package week2.section32;

import java.util.Scanner;

public class TrafficLightSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the color of the traffic light (red, yellow, or green):");

        String color = scanner.nextLine();

        if (color.equals("green")) {
            System.out.println("Go! Drive safely.");
        } else {
            System.out.println("Slow down! Prepare to stop.");
        }

        scanner.close();
    }
}
