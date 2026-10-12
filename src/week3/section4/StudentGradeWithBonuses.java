package week3.section4;

import java.util.Scanner;

public class StudentGradeWithBonuses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of bonus points: ");
        int bonusPoints = scanner.nextInt();

        System.out.println("Enter the exam grade: ");
        char examGrade = scanner.next().charAt(0);

        if (bonusPoints > 5) {
            if (examGrade == 'A' || examGrade == 'B') {
                System.out.println("Congratulations! You receive a reward.");
            } else {
                System.out.println("You do not receive a reward.");
            }
        } else {
            System.out.println("You do not receive a reward.");
        }

        scanner.close();
    }
}
