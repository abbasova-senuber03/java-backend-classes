package az.edu.turing.homework6;
import java.util.Scanner;

public class Task4 {
    public static int Task4(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number : ");
        int number = scanner.nextInt();
        int say = 0;
        while (number > 0) {
            int cem = Task4(number);
            number -= cem;
            say++;          }

        System.out.println("Number of operations : " + say);
    }
}
