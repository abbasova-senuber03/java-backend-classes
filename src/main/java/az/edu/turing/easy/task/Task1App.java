package az.edu.turing.easy.task;
import java.util.Scanner;

public class Task1App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("iki reqemli eded daxil et");
        int number = scanner.nextInt();
        if (number < 10 || number > 99) {
            System.out.println("10 ile 99 arasi eded daxil et");
        } else {
            int firstnumber = number / 10;
            int secondnumber = number % 10;
            System.out.println(firstnumber + " " + secondnumber);
        }

    }
}

