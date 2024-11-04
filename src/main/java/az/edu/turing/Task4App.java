package az.edu.turing;

import java.util.Scanner;
public class Task4App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double sumOfSquares = (num1 * num1) + (num2 * num2);
        System.out.println("The sum of the squares of " + num1 + " and " + num2 + " is: " + sumOfSquares);
    }
}
