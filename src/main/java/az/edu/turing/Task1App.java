package az.edu.turing;

import java.util.Scanner;

public class Task1App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is two digits
        if (number >= 10 && number <= 99) {
            // Extract digits
            int tens = number / 10; // Tens place
            int units = number % 10; // Units place

            // Print the digits separated by a space
            System.out.println(tens + " " + units);
        } else {
            System.out.println("Please enter a valid two-digit number.");
        }

    }
}

