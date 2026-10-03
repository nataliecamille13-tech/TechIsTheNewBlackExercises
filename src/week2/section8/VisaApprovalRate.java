package week2.section8;

import java.util.Scanner;

public class VisaApprovalRate {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of visa applications they have submitted:");
        int num1 = scanner.nextInt();

        System.out.println("Please enter the number of visa applications they have approved:");
        int num2 = scanner.nextInt();

        boolean approvalRate = num1 == num2;

        System.out.println("You have a 100% approval rate: " + approvalRate);
    }
}
