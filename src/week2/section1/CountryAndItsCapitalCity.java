package week2.section1;

import java.util.Scanner;

public class CountryAndItsCapitalCity {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a country name:");
        String country = input.nextLine();

        System.out.println("Please enter its capital city:");
        String capitalCity = input.nextLine();

        System.out.println("The capital city of " + country + " is " + capitalCity);



    }
}
