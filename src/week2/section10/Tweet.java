package week2.section10;

import java.util.Scanner;

public class Tweet {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int maximumWords = 280;
        System.out.println("Please enter the number of words you want to tweet:");

        int userNumberTweet = scanner.nextInt();
        boolean meetsRequirement = userNumberTweet <= 280;
        System.out.println("Tweeted: " + meetsRequirement);

    }
}
