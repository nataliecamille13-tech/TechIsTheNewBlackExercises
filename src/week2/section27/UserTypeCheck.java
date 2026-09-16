package week2.section27;

import java.util.Scanner;

public class UserTypeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your user type?");
        String userType = scanner.nextLine();

        if (userType.equals("admin")) {
            System.out.println("Access to all features and functionalities of the platform");
            System.out.println("Ability to create and manage user accounts");
            System.out.println("Ability to adjust platform settings and configurations");
        } else if (userType.equals("mentor")) {
            System.out.println("Ability to communicate with mentees through the platform");
            System.out.println("Ability to track and analyze mentee progress and performance");
        } else if (userType.equals("free trial users")) {
            System.out.println("Limited access to certain features, functionalities and support of the platform");
            System.out.println("Ability to explore and experiment with the platform's basic features");
        } else if (userType.equals("paid users")) {
            System.out.println("Full access to all features and functionalities of the platform");
            System.out.println("Access to premium support and resources");
            System.out.println("Ability to collaborate and communicate with other users on the platform");
        } else {
            System.out.println("User's type is wrong. Try again");
        }
    }
}