package week2.section5;

import java.util.Scanner;

public class Gender {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your gender:");
        String gender = scanner.nextLine();

        System.out.println("Your gender is " + gender.charAt(0));

    }
}
