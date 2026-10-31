package week3.section20;

import java.util.Scanner;

public class RecipeIngredientsSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cuisine = scanner.nextLine();
        String preference = scanner.nextLine();

        // Check the selected cuisine.
        switch (cuisine.toLowerCase()) {

            case "italian":
                // Check the food preference.
                switch (preference.toLowerCase()) {
                    case "vegetarian":
                        System.out.println("Tomatoes, Basil, Mozzarella, Olive Oil, Pasta");
                        break;

                    case "non-vegetarian":
                        System.out.println("Beef, Tomatoes, Garlic, Parmesan, Pasta");
                        break;

                    default:
                        System.out.println("Invalid food preference");
                        break;
                }
                break;

            case "mexican":
                switch (preference.toLowerCase()) {
                    case "vegetarian":
                        System.out.println("Beans, Tomatoes, Avocado, Corn, Tortillas");
                        break;

                    case "non-vegetarian":
                        System.out.println("Chicken, Beef, Beans, Salsa, Tortillas");
                        break;

                    default:
                        System.out.println("Invalid food preference");
                        break;
                }
                break;

            case "indian":
                switch (preference.toLowerCase()) {
                    case "vegetarian":
                        System.out.println("Lentils, Rice, Spinach, Spices, Naan");
                        break;

                    case "non-vegetarian":
                        System.out.println("Chicken, Lamb, Rice, Curry, Naan");
                        break;

                    default:
                        System.out.println("Invalid food preference");
                        break;
                }
                break;

            default:
                System.out.println("Invalid cuisine");
                break;
        }

        scanner.close();
    }
}
