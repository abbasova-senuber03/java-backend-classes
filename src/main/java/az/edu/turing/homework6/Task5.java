package az.edu.turing.homework6;
import java.util.Scanner;
public class Task5 {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("x deyerini daxil edin: ");
            double x = scanner.nextDouble();
            double y = ((2 * x - 3) / (Math.pow(x, 2) + 3 * x - 4)) - ((Math.pow(x, 2) - 5 * x + 7) / (x + 2));
            System.out.println("y:" + y);
        }
    }


