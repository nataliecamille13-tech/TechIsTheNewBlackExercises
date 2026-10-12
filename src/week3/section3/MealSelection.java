package week3.section3;

import java.util.Scanner;

public class MealSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Steakhouse!");
        System.out.println("Select your meat preference (V/VG/NV):");

        String meatPreference = scanner.nextLine();

        if (meatPreference.equalsIgnoreCase("VG")) {
            System.out.println("Recommended: Steak Portobello Well Done");
        } else if (meatPreference.equalsIgnoreCase("NV")) {
            System.out.println("Select doneness level:");

            String doneness = scanner.nextLine();
            String cut = "";

            if (doneness.equalsIgnoreCase("Rare")) {
                cut = "Filet Mignon";
            } else if (doneness.equalsIgnoreCase("Medium Rare")) {
                cut = "Ribeye";
            } else if (doneness.equalsIgnoreCase("Medium")) {
                cut = "Sirloin";
            } else if (doneness.equalsIgnoreCase("Medium Well")) {
                cut = "New York";
            }

            System.out.println("Recommended: Steak " + cut + " " + doneness);
        }

        scanner.close();
    }
}
