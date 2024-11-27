package az.edu.turing.easy.task;
import java.util.Scanner;
public class Task4App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        double water = 0;
        int days = 0;
        for ( int i = N; i >= 1; i--) {
            water += i;
         if (water > 0.5){
             days ++;
         }
    }
    System.out.println(days);
    }
}
