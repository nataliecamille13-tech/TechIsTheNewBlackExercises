package week2.section4;

import java.util.Scanner;

public class IsMarried {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Are you married?");
        boolean isMarried = input.nextBoolean();
        System.out.println(isMarried);
    }
}
