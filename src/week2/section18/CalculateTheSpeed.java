package week2.section18;

import java.util.Scanner;

public class CalculateTheSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distance = scanner.nextDouble();
        double time = scanner.nextDouble();

        System.out.print("Enter the distance traveled (miles): " + distance + "\n");
        System.out.print("Enter the time taken (hours): " + time + "\n");

        distance /= time;

        System.out.print("The speed of the car is " + distance + " mph.");
    }
}
