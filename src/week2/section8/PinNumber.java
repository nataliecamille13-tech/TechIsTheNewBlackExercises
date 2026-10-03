package week2.section8;

import java.util.Scanner;

public class PinNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please create a pin number:");
        int num1 = scanner.nextInt();

        System.out.println("Please repeat the pin number:");
        int num2 = scanner.nextInt();

        boolean pinNumbersDoNotMatch = num1 != num2;

        System.out.println("Pin Numbers do not match: " + pinNumbersDoNotMatch);
    }
}
