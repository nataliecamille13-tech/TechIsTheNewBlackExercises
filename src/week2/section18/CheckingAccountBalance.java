package week2.section18;

import java.util.Scanner;

public class CheckingAccountBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 118000.00;

        System.out.println("Please enter the first transaction amount:");
        balance -= sc.nextDouble();

        System.out.println("Please enter the second transaction amount:");
        balance -= sc.nextDouble();

        System.out.println("Please enter the third transaction amount:");
        balance -= sc.nextDouble();

        System.out.println("Your Remaining Balance: $" + balance);
    }
}
