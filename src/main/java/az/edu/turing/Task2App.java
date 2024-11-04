package az.edu.turing;
import java.util.Scanner;
public class Task2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin (1000-dən kiçik): ");
        int a = scanner.nextInt();
        System.out.print("İkinci ədədi daxil edin (1000-dən kiçik): ");
        int b = scanner.nextInt();
        System.out.print("Üçüncü ədədi daxil edin (1000-dən kiçik): ");
        int c = scanner.nextInt();
        if (a > 1000 || b > 1000 || c > 1000) {
            System.out.println("Zəhmət olmasa, 1000-i aşmayan ədədlər daxil edin.");
            scanner.close();
            return;
        }
        int orta;
        if ((a > b && a < c) || (a < b && a > c)) {
            orta = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            orta = b;
        } else {
            orta = c;
        }

        System.out.println("Qiymətcə orta olan ədəd: " + orta);
    }
}
