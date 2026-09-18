package week2.section14;

import java.util.Scanner;

public class RoomUpgrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Does your room have a balcony view?");
        boolean hasBalconyView = input.nextBoolean();

        System.out.println("Does your room have a king sized bed?");
        boolean hasKingBed = input.nextBoolean();

        boolean eligibleForUpgrade = hasBalconyView || hasKingBed;

        System.out.println("You are eligible for a premium upgrade: " + eligibleForUpgrade);

        input.close();
    }
}
