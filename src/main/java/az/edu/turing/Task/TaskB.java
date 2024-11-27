package az.edu.turing.Task;
import java.util.Scanner;
public class TaskB {
      public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int n = scanner.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
      }

      int count = 0;
      for (int i = 1; i < n - 1; i++) {
      if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
      count++;
      }
          }

      System.out.println(count);
        }
    }


