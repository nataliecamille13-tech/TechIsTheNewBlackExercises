package week2.section3;

import java.util.Scanner;

public class LetMeFindTheReturnOnInvestmentROI {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the invested amount in $:");
        double investedAmount = scanner.nextDouble();

        System.out.println("Please enter the ROI amount:");
        double ROI = scanner.nextDouble();

        double roiPercentage = (ROI / investedAmount) * 100;

        System.out.printf("Your ROI is %.2f%%", roiPercentage);

        scanner.close();

    }
}