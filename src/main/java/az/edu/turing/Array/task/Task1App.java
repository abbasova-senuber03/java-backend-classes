package az.edu.turing.Array.task;
import java.util.Scanner;
public class Task1App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();
            if (word.length() > 0) {
                char lastChar = word.charAt(word.length() - 1);
                System.out.println("The last character of the word is: " + lastChar);
            } else {
                System.out.println("You entered an empty string.");
            }
        }
    }

