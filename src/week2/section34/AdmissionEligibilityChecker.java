package week2.section34;

import java.util.Scanner;

public class AdmissionEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("GPA:");
        double gpa = scanner.nextDouble();

        System.out.println("Entrance Exam Score:");
        int examScore = scanner.nextInt();

        if (gpa >= 3.0 && examScore >= 80) {
            System.out.println("Admission Eligible");
        } else {
            System.out.println("Admission Not Eligible");
        }

        scanner.close();
    }
}
