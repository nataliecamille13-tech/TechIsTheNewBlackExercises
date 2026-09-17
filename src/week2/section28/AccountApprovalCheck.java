package week2.section28;

import java.util.Scanner;

public class AccountApprovalCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Has your account been approved by an administrator? (true/false)");

        boolean approved = scanner.nextBoolean();

        if (approved) {
            System.out.println("Congratulations! Your account has been approved and is ready to use.");
        } else {
            System.out.println("Sorry, your account has not been approved yet. Please check back later.");
        }
    }
}
