package week2.section17;

import java.util.Scanner;

public class CouponCodeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Please enter your coupon:");
        String customerEnteredCoupon = scanner.nextLine();

        // Check if coupon is valid
        boolean isValidCoupon =
                customerEnteredCoupon.equals("10OFFNOW") ||
                        customerEnteredCoupon.equals("SPRINGSALE") ||
                        customerEnteredCoupon.equals("SAVEBIG2022") ||
                        customerEnteredCoupon.equals("FEBRUARY25") ||
                        customerEnteredCoupon.equals("SUMMERSALE21");

        // Output
        System.out.println("The Coupon is valid: " + isValidCoupon);

    }
}
