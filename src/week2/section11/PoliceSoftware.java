package week2.section11;

import java.util.Scanner;

public class PoliceSoftware {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your plate number:");

        String enteredPlateNumber = scanner.nextLine();
        String correctPlateNumber = "123LA";

        boolean isPlateNumberMatched = enteredPlateNumber.equals(correctPlateNumber);
        System.out.println("We will have to tow your car: " + isPlateNumberMatched);

    }
}
