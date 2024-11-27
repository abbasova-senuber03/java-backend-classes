package az.edu.turing.Eolymptask;

import java.util.Scanner;

public class Lesson1App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b + c == 2020) {
            System.out.println(a + "+" + b + "+" + c);
            return;
        }

        if (a + b - c == 2020) {
            System.out.println(a + "+" + b + "-" + c);
            return;
        }


        if (a - b + c == 2020) {
            System.out.println(a + "-" + b + "+" + c);
            return;
        }


        if (a - b - c == 2020) {
            System.out.println(a + "-" + b + "-" + c);
            return;
        }


        if (b + a + c == 2020) {
            System.out.println(b + "+" + a + "+" + c);
            return;
        }


        if (b + a - c == 2020) {
            System.out.println(b + "+" + a + "-" + c);
            return;
        }


        if (b - a + c == 2020) {
            System.out.println(b + "-" + a + "+" + c);
            return;
        }


        if (b - a - c == 2020) {
            System.out.println(b + "-" + a + "-" + c);
            return;
        }


        if (c + a + b == 2020) {
            System.out.println(c + "+" + a + "+" + b);
            return;
        }


        if (c + a - b == 2020) {
            System.out.println(c + "+" + a + "-" + b);
            return;
        }


        if (c - a + b == 2020) {
            System.out.println(c + "-" + a + "+" + b);
            return;
        }


        if (c - a - b == 2020) {
            System.out.println(c + "-" + a + "-" + b);
            return;
        }

        System.out.println("CORONA");
    }
}
