package week3.section17;

import java.util.Scanner;

public class ProgrammingLanguages  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a programming language.
        System.out.println("Enter a programming language:");
        String language = scanner.nextLine();

        // Use a switch statement to determine the language type.
        switch (language.toLowerCase()) {
            // Interpreted programming languages
            case "python":
            case "ruby":
            case "perl":
            case "javascript":
                System.out.println(language + " is an interpreted language");
                break;

            // Compiled programming languages
            case "java":
            case "c++":
            case "c#":
            case "objective-c":
            case "swift":
                System.out.println(language + " is a compiled language");
                break;

            // Handle languages that are not recognized.
            default:
                System.out.println("Error: Invalid programming language. Please enter a valid programming language");
                break;
        }

        scanner.close();
    }
}
