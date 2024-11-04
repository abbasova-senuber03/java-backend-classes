package az.edu.turing;
import java.util.Scanner;
public class Task5App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid three-digit number.");
            return;
        }

        int firstDigit = number / 100;
        int lastDigit = number % 10;
        if (firstDigit > lastDigit) {
            System.out.println(firstDigit);
        } else if (firstDigit < lastDigit) {
            System.out.println(lastDigit);
        } else {
            System.out.println("=");
        }


    }
}

