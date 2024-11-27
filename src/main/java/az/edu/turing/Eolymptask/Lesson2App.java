package az.edu.turing.Eolymptask;

import java.util.Scanner;

public class Lesson2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int m = scanner.nextInt();


        int[][] matrix = new int[n][m];


        int value = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = value++;
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}

