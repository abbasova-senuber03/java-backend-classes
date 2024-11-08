package az.edu.turing.Array.task;
import java.util.Scanner;
public class Task2App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (word.length() > 0) {
                char lastChar = word.charAt(word.length() - 1);
                if (isVowel(lastChar)) {
                    System.out.println("The last character '" + lastChar + "' is a vowel.");
                } else {
                    System.out.println("The last character '" + lastChar + "' is not a vowel.");
                }
            } else {
                System.out.println("You entered an empty string.");
            }

                 }

        public static boolean  isVowel (char c) {
            c = Character.toLowerCase(c);
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
    }


