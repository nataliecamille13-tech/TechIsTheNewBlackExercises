package week2.section9;

import java.util.Scanner;

public class OfferNegotiation {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the expected salary:");
        double expectedSalary = scanner.nextDouble();

        System.out.println("Please enter the offered salary:");
        double offeredSalary = scanner.nextDouble();

        boolean shouldINegotiate = expectedSalary > offeredSalary;

        System.out.println("Should I negotiate? " + shouldINegotiate);

    }
}
