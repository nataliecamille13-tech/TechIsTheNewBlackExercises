package week2.section39;

import java.util.Scanner;

public class MakeUpLookSuggestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your eye color (blue, green, brown, or hazel):");
        String eyeColor = scanner.nextLine();

        System.out.println("Enter your hair color (blonde, brown, black, or red):");
        String hairColor = scanner.nextLine();

        if ((eyeColor.equalsIgnoreCase("blue") || eyeColor.equalsIgnoreCase("green"))
                && (hairColor.equalsIgnoreCase("blonde") || hairColor.equalsIgnoreCase("brown"))) {

            System.out.println("We suggest a natural makeup look");

        } else if ((eyeColor.equalsIgnoreCase("blue") || eyeColor.equalsIgnoreCase("green"))
                && (hairColor.equalsIgnoreCase("black") || hairColor.equalsIgnoreCase("red"))) {

            System.out.println("We suggest a bold lip look");

        } else if (eyeColor.equalsIgnoreCase("brown") || eyeColor.equalsIgnoreCase("hazel")) {

            System.out.println("We suggest a smokey eye look");

        } else {
            System.out.println("Sorry, we couldn't identify your eye color or hair color");
        }
    }
}
