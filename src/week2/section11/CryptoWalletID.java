package week2.section11;

import java.util.Scanner;

public class CryptoWalletID {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the crypto wallet ID of a receiver:");

        String enteredWalletID = scanner.nextLine();
        String correctWalletID = "0x742d35Cc6634C0532925a3b844Bc454e4438f44e";

        boolean isTransactionApproved = enteredWalletID.equals(correctWalletID);
        System.out.println("Transaction Approved: " + isTransactionApproved);

    }
}
