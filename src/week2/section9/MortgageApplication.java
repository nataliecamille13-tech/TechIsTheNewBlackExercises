package week2.section9;

import java.util.Scanner;

public class MortgageApplication {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double minimumIncome = 50000.00;
        double minimumCreditScore = 700;


        double userAnnualIncome = scanner.nextDouble();

        double userCreditScore = scanner.nextDouble();

        boolean meetsIncomeRequirement = userAnnualIncome >= minimumIncome;
        boolean meetsCreditScoreRequirement = userCreditScore >= minimumCreditScore;

        System.out.println("You meet the minimum income requirements: " + meetsIncomeRequirement);

        System.out.println("You meet the minimum credit score requirements: " + meetsCreditScoreRequirement);
    }
}
