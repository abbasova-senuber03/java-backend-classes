package az.edu.turing;
import java.util.Scanner;

public class Task8App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit positive integer: ");
        int number = scanner.nextInt();
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid three-digit positive integer.");
            return;
        }

        int sum = 0;
        int temp = number;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        double squareRoot = Math.sqrt(sum);
        System.out.printf("The square root of the sum of digits is: %.3f%n", squareRoot);

    }
}
