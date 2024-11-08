package az.edu.turing.Array.task;
import java.util.Scanner;
public class Task3App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String inputWord = scanner.nextLine();

            String reversedWord = new StringBuilder(inputWord).reverse().toString();

            String result = reversedWord.toUpperCase();
            System.out.println("Reversed and Uppercase word: " + result);
        }
    }

