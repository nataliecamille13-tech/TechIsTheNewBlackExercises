package week2.section15;

import java.util.Scanner;

public class RealEstatePropertySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many followers does the user have?");
        int followerCount = scanner.nextInt();

        System.out.println("Is Email Verified?");
        boolean isEmailVerified = scanner.nextBoolean();

        boolean isEligible = (followerCount >= 100000) && isEmailVerified;

        System.out.println("User is eligible for a verified blue icon: " + isEligible);
    }
}
