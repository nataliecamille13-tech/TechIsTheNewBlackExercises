package week2.section38;

import java.util.Scanner;

public class FootballMatchResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the score of the match for team 1:");
        int team1 = scanner.nextInt();

        System.out.println("Enter the score of the match for team 2:");
        int team2 = scanner.nextInt();

        if (team1 < 0 || team2 < 0) {
            System.out.println("Invalid score");
        } else if (team1 == team2) {
            System.out.println("It's a draw");
        } else if (team1 > team2) {
            System.out.println("team 1 won");
        } else {
            System.out.println("team 2 won");
        }
    }
}
