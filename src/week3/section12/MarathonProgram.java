package week3.section12;

import java.util.Scanner;

public class MarathonProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your health status (good/bad):");
        String healthStatus = scanner.nextLine();

        if (healthStatus.equalsIgnoreCase("good")) {
            System.out.println("Enter your fitness level (high/medium/low):");
            String fitnessLevel = scanner.nextLine();

            if (fitnessLevel.equalsIgnoreCase("high")) {
                System.out.println("We recommend you to prepare for a full marathon");
            } else if (fitnessLevel.equalsIgnoreCase("medium")) {
                System.out.println("We recommend you to prepare for a half marathon");
            } else if (fitnessLevel.equalsIgnoreCase("low")) {
                System.out.println("We recommend you to prepare for a 5k run");
            } else {
                System.out.println("Wrong entry for fitness level");
            }

        } else if (healthStatus.equalsIgnoreCase("bad")) {
            System.out.println("We recommend you to participate in the marathon by walking and running as much as you can");
        } else {
            System.out.println("Wrong entry for health status");
        }

        scanner.close();
    }
}
