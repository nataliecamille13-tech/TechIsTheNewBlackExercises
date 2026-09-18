package week2.section16;

import java.util.Scanner;

public class BooleanLogicInJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        boolean result = (A < B && C > D) || (A > B && C < D);

        System.out.println(result);
    }
}
