package az.edu.turing;
import java.util.Scanner;

public class Task9App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-digit positive integer: ");
        int number = scanner.nextInt();
        if (number < 1000 || number > 9999) {
            System.out.println("Please enter a valid four-digit positive integer.");
            return;
        }
        int sum = (number / 1000) + (number % 10);
        System.out.println("The sum of the first and last digit is: " + sum);
    }
}
