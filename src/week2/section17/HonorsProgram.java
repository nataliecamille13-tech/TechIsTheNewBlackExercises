package week2.section17;

import java.util.Scanner;

public class HonorsProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("What is your major?");
        String major = scanner.nextLine();

        System.out.println("What is your GPA?");
        double gpa = scanner.nextDouble();

        // Check eligibility
        boolean isEligible =
                (major.equals("computer science") && gpa >= 3.0) ||
                        (major.equals("engineering") && gpa >= 3.5);

        // Output
        System.out.println("You are eligible for the honors program: " + isEligible);

        scanner.close();
    }
}
