package az.edu.turing;

import java.util.Scanner;

public class NumberGueesApp {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
          int number = scanner.nextInt();
//        if (number < 0 ) {
//            System.out.println("Negative");
//        } else if (number > 0) {
//            System.out.println("Positive");
//        }else {
//            System.out.println("Zero");
     String result = number  < 0 ? "Negative" : ( number == 0 ? "Zero" : "Positive ");
    System.out.println(result);
        }
    }
