package week3.section11;

import java.util.Scanner;

public class GroupDeterminationBasedOnGenderAndAgeInJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your gender:");
        String gender = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if (age < 20) {
            if (gender.equalsIgnoreCase("male")) {
                System.out.println("Boy");
            } else if (gender.equalsIgnoreCase("female")) {
                System.out.println("Girl");
            }
        } else {
            if (gender.equalsIgnoreCase("male")) {
                System.out.println("Man");
            } else if (gender.equalsIgnoreCase("female")) {
                System.out.println("Woman");
            }
        }

        scanner.close();
    }
}

