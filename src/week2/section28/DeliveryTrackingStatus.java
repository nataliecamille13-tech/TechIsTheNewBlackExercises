package week2.section28;

import java.util.Scanner;

public class DeliveryTrackingStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Has the package been delivered? (true/false)");

        boolean isDelivered = scanner.nextBoolean();

        if (isDelivered) {
            System.out.println("The package has been delivered to its destination.");
        } else {
            System.out.println("The package has not yet been delivered. Please check back later for updates");
        }
    }
}
