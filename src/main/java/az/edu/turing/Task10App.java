package az.edu.turing;

import java.util.Scanner;

public class Task10App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of months in a year (1 to 12): ");
        int N = scanner.nextInt();
        if (N < 1 || N > 12) {
            System.out.println("Please enter a valid number of months (1-12).");
            return;
        }
        System.out.print("Enter the month number (1 to " + N + "): ");
        int month = scanner.nextInt();
        if (month < 1 || month > N) {
            System.out.println("Please enter a valid month number (1-" + N + ").");
            return;
        }
        String quarter;
        if (month >= 1 && month <= N / 4) {
            quarter = "First";
        } else if (month > N / 4 && month <= N / 2) {
            quarter = "Second";
        } else if (month > N / 2 && month <= 3 * N / 4) {
            quarter = "Third";
        } else {
            quarter = "Fourth";
        }

        System.out.println("The month " + month + " belongs to the " + quarter + " quarter.");
    }
}
