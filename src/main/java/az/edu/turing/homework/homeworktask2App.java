package az.edu.turing.homework;
import java.util.Random;
import java.util.Scanner;
public class homeworktask2App {
        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int size = 5;
            String[][] board = new String[size][size];

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    board[i][j] = "-";
                }
            }

            int targetRow = random.nextInt(size);
            int targetCol = random.nextInt(size);

            System.out.println("All set. Get ready to rumble!");

            boolean gameWon = false;
            while (!gameWon) {
                printBoard(board);
                int row = -1;
                while (row < 1 || row > size) {
                    System.out.print("Enter row (1-5): ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Please enter a valid number.");
                        scanner.next();
                    }
                    row = scanner.nextInt();
                }

                // Get player input for column
                int col = -1;
                while (col < 1 || col > size) {
                    System.out.print("Enter column (1-5): ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Please enter a valid number.");
                        scanner.next(); // clear the invalid input
                    }
                    col = scanner.nextInt();
                }

                row -= 1;
                col -= 1;
                if (row == targetRow && col == targetCol) {
                    System.out.println("You have won!");
                    board[row][col] = "x";
                    gameWon = true;
                } else {
                    board[row][col] = "*";
                }
            }
        }
        public static void printBoard(String[][] board) {
            System.out.println("Current Board:");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
            }
        }
    }


