package week3.section20;

import java.util.Scanner;

public class GPUCPURAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a computer component.
        System.out.println("Enter a computer component (CPU, GPU, RAM, storage):");
        String component = scanner.nextLine();

        // Ask the user to enter a computer type.
        System.out.println("Enter a computer type (desktop, laptop):");
        String computerType = scanner.nextLine();

        // Outer switch checks the computer component.
        switch (component.toLowerCase()) {

            case "cpu":
                // Inner switch checks the computer type.
                switch (computerType.toLowerCase()) {
                    case "desktop":
                        System.out.println("The AMD Ryzen 9 5950X is a popular CPU choice for high-performance desktops");
                        break;
                    case "laptop":
                        System.out.println("The Intel Core i7 is a popular CPU choice for high-performance laptops");
                        break;
                    default:
                        System.out.println("Invalid computer type");
                        break;
                }
                break;

            case "gpu":
                switch (computerType.toLowerCase()) {
                    case "desktop":
                        System.out.println("The NVIDIA GeForce RTX 3090 is a popular GPU choice for high-performance desktops");
                        break;
                    case "laptop":
                        System.out.println("The NVIDIA GeForce RTX 3080 is a popular GPU choice for high-performance laptops");
                        break;
                    default:
                        System.out.println("Invalid computer type");
                        break;
                }
                break;

            case "ram":
                switch (computerType.toLowerCase()) {
                    case "desktop":
                        System.out.println("The G.SKILL Trident Z RGB is a popular RAM choice for high-performance desktops");
                        break;
                    case "laptop":
                        System.out.println("The Corsair Vengeance SODIMM is a popular RAM choice for high-performance laptops");
                        break;
                    default:
                        System.out.println("Invalid computer type");
                        break;
                }
                break;

            case "storage":
                switch (computerType.toLowerCase()) {
                    case "desktop":
                        System.out.println("The Samsung 970 EVO Plus is a popular storage choice for high-performance desktops");
                        break;
                    case "laptop":
                        System.out.println("The Western Digital Black SN750 is a popular storage choice for high-performance laptops");
                        break;
                    default:
                        System.out.println("Invalid computer type");
                        break;
                }
                break;

            // Handle invalid computer components.
            default:
                System.out.println("Invalid computer component");
                break;
        }

        scanner.close();
    }
}
