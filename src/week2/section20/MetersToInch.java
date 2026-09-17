package week2.section20;

import java.util.Scanner;

public class MetersToInch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter meters:");

        double length = scanner.nextDouble();
        length *= 39.37;

        System.out.println(length + " inches");
    }
}
