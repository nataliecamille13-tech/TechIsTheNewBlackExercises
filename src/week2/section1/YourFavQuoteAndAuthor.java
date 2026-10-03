package week2.section1;

import java.util.Scanner;

public class YourFavQuoteAndAuthor {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your favorite quote?");
        String quote = input.nextLine();

        System.out.println("Who is the author?");
        String author = input.nextLine();

        String output = "\"" + quote + "\" - " + author;

        System.out.println(output);
    }
}
