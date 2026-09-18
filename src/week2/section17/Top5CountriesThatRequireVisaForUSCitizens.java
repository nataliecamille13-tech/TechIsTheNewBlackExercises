package week2.section17;

import java.util.Scanner;

public class Top5CountriesThatRequireVisaForUSCitizens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which country are you traveling to?");
        String destinationCountry = scanner.nextLine();

        // Check if visa is required
        boolean isVisaRequired =
                destinationCountry.equals("China") ||
                        destinationCountry.equals("India") ||
                        destinationCountry.equals("Russia") ||
                        destinationCountry.equals("Brazil") ||
                        destinationCountry.equals("Vietnam");

        // Output
        System.out.println("A visa is required for both tourist and business purposes in "
                + destinationCountry + ": " + isVisaRequired);

    }
}
