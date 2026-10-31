package week3.section18;

import java.util.Scanner;

public class LinuxCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a Linux command.
        System.out.println("Enter a Linux Command:");
        String command = scanner.nextLine();

        // Use a switch statement to classify the command.
        switch (command.toLowerCase()) {

            // Navigation commands
            case "cd":
            case "pwd":
                System.out.println(command + " is a navigation command");
                break;

            // File management commands
            case "ls":
            case "cp":
            case "mv":
            case "mkdir":
                System.out.println(command + " is a file management command");
                break;

            // System management commands
            case "shutdown":
            case "restart":
                System.out.println(command + " is a system management command");
                break;

            // Display an error for unrecognized commands.
            default:
                System.out.println("Invalid command. Please enter a valid command");
                break;
        }

        scanner.close();
    }
}
