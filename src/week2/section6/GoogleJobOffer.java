package week2.section6;

import java.util.Scanner;

public class GoogleJobOffer {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();
        String jobTitle = scanner.nextLine();
        double salary = scanner.nextDouble();

        System.out.printf("Dear %s,\nWelcome to Google!\nWe are delighted to have you as a %s. Your starting salary is $%.2f\n\nSincerely,\nGoogle HR Representative\n", fullName, jobTitle, salary);



    }
}
