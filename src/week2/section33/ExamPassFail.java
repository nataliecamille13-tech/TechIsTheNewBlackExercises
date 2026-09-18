package week2.section33;

import java.util.Scanner;

public class ExamPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your score for exam1:");
        double exam1 = scanner.nextDouble();

        System.out.println("Please enter your score for exam2:");
        double exam2 = scanner.nextDouble();

        System.out.println("Please enter your score for exam3:");
        double exam3 = scanner.nextDouble();

        double average = (exam1 + exam2 + exam3) / 3;

        System.out.printf("Your average score is %.2f%n", average);

        if (average >= 70) {
            System.out.println("Congratulations, you passed the exam");
        } else {
            System.out.println("Sorry, you failed the exam");
        }

        scanner.close();
    }
}
