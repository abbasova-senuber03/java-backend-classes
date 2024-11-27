package az.edu.turing.Task;
import java.util.Scanner;
public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] maaslarStr = input.split(" ");
        double[] maaslar = new double[maaslarStr.length];

        for (int i = 0; i < maaslarStr.length; i++) {
            maaslar[i] = Double.parseDouble(maaslarStr[i]);
        }
        double maxMaas = maaslar[0];
        for (double maas : maaslar) {
            if (maas > maxMaas) {
                maxMaas = maas;
            }
        }
        System.out.printf("%.2f\n", maxMaas);
    }
}
