package az.edu.turing.homework;
import java.util.Random;
import java.util.Scanner;
public class homeworktask1App {
 public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int targetNumber = random.nextInt(101);

            System.out.println("Let the game begin!");

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            int[] guesses = new int[100];
            int guessCount = 0;

            boolean gameWon = false;

            while (!gameWon) {
                System.out.print("Enter your guess (0-100): ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid number.");
                    scanner.next();
                    System.out.print("Enter your guess (0-100): ");
                }

                int playerGuess = scanner.nextInt();
                if (playerGuess < 0 || playerGuess > 100) {
                    System.out.println("The number must be between 0 and 100. Please, try again.");
                    continue;
                }

                guesses[guessCount] = playerGuess;
                guessCount++;

                if (playerGuess < targetNumber) {
                    System.out.println("Your number is too small. Please, try again..");
                } else if (playerGuess > targetNumber) {
                    System.out.println("Your number is too big. Please, try again..");
                } else {
                    System.out.println("Congratulations, " + name + "!");
                    gameWon = true;
                }
            }

            System.out.println("Your numbers:");

            int[] actualGuesses = new int[guessCount];
            System.arraycopy(guesses, 0, actualGuesses, 0, guessCount);

            for (int i = 0; i < actualGuesses.length - 1; i++) {
                for (int j = i + 1; j < actualGuesses.length; j++) {
                    if (actualGuesses[i] < actualGuesses[j]) {
                        int temp = actualGuesses[i];
                        actualGuesses[i] = actualGuesses[j];
                        actualGuesses[j] = temp;
                    }
                }
            }
            for (int i = 0; i < actualGuesses.length; i++) {
                System.out.print(actualGuesses[i] + " ");
            }

        }
    }


