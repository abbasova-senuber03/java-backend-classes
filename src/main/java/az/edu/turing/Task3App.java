package az.edu.turing;
public class Task3App {
    public static void main(String[] args) {

        int S = 100;
        int totalAmount = 0;
        int amountThisYear = 1;
        int age = 1;

        while (totalAmount < S) {
            totalAmount += amountThisYear;
            System.out.println("Age: " + age + ", Amount this year: " + amountThisYear + ", Total: " + totalAmount);
            age++;
            amountThisYear = (amountThisYear * 2) + age;
        }

        System.out.println("Buratino will reach at least " + S + " dollars on birthday: " + age);
    }
}
