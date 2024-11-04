package az.edu.turing;
import java.util.Scanner;
public class Task7App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of the sides of the triangle:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;
        if ((a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
