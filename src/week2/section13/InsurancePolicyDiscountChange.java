package week2.section13;

import java.util.Scanner;

public class InsurancePolicyDiscountChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you have life insurance?");
        boolean hasLifeCoverage = input.nextBoolean();

        System.out.println("Do you have auto insurance?");
        boolean hasAutoCoverage = input.nextBoolean();

        boolean eligibleForDiscount = hasLifeCoverage || hasAutoCoverage;

        System.out.println("Is user eligible for a 20% discount? " + eligibleForDiscount);

        input.close();
    }
}
