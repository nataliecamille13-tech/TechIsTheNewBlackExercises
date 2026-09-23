package week2.section11;

import java.util.Scanner;

public class StayCalmAndCarryOn {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Stay Calm and");
        String answer = scanner.nextLine();

        System.out.println("Stay Calm and " + answer);

        boolean correctAnswer = answer.equals("Carry On");

        System.out.println("Correct answer: " + correctAnswer);

    }
}
