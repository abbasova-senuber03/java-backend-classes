package az.edu.turing;

import java.util.Scanner;

public class Task1App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();
        if (number >= 10 && number <= 99) {
            int tens = number / 10;
            int units = number % 10;
            System.out.println(tens + " " + units);
        } else {
            System.out.println("Please enter a valid two-digit number.");
        }

    }
}

