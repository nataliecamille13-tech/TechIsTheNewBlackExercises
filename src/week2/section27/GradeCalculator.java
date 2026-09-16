package week2.section27;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student's score:");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("The student's grade is A");
        } else if (score >= 80) {
            System.out.println("The student's grade is B");
        } else if (score >= 70) {
            System.out.println("The student's grade is C");
        } else if (score >= 60) {
            System.out.println("The student's grade is D");
        } else {
            System.out.println("The student's grade is F");
        }
    }
}
