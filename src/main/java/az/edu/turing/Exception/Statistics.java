package az.edu.turing.Exception;
import java.util.Scanner;

public class Statistics {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] ages = new int[50];
            int count = 0;
            while (true) {
                System.out.print("Enter an age: ");
                String input = scanner.nextLine();

                // Exit condition
                if (input.equalsIgnoreCase("stop") || input.equalsIgnoreCase("exit")) {
                    break;
                }

                try {
                    int age = Integer.parseInt(input);

                    if (age < 0) {
                        throw new IllegalArgumentException("Age cannot be negative.");
                    } else if (age > 200) {
                        throw new ArithmeticException("Age is too large.");
                    }

                    if (count < 50) {
                        ages[count] = age;
                        count++;
                    } else {
                        System.out.println("Maximum number of ages reached.");
                        break;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                } catch (IllegalArgumentException | ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.print("Entered Ages: [");
            for (int i = 0; i < count; i++) {
                if (i > 0) System.out.print(", ");
                System.out.print(ages[i]);
            }
            System.out.println("]");

            for (int i = 0; i < count; i++) {
                System.out.print("Age: " + ages[i]);
                try {
                    long factorial = calculateFactorial(ages[i]);
                    System.out.println(" -> Factorial: " + factorial + ", " + (isEven(ages[i]) ? "Even" : "Odd") + ".");
                } catch (ArithmeticException e) {
                    System.out.println(" -> Factorial too large to calculate, " + (isEven(ages[i]) ? "Even" : "Odd") + ".");
                }
            }

            getStatistics(ages, count);
        }


        public static long calculateFactorial(int age) throws ArithmeticException {
            long factorial = 1;
            for (int i = 1; i <= age; i++) {
                factorial *= i;
                if (factorial < 0) {
                    throw new ArithmeticException("Factorial exceeds the limit.");
                }
            }
            return factorial;
        }

        public static boolean isEven(int age) {
            return age % 2 == 0;
        }

        public static void getStatistics(int[] ages, int count) {
            int totalCount = count;
            int sumOfAges = 0;
            int children = 0, teenagers = 0, adults = 0, seniors = 0;

            for (int i = 0; i < count; i++) {
                sumOfAges += ages[i];
                if (ages[i] >= 0 && ages[i] <= 12) {
                    children++;
                } else if (ages[i] >= 13 && ages[i] <= 19) {
                    teenagers++;
                } else if (ages[i] >= 20 && ages[i] <= 64) {
                    adults++;
                } else {
                    seniors++;
                }
            }

            double averageAge = totalCount > 0 ? (double) sumOfAges / totalCount : 0;

            System.out.println("Statistical Summary:");
            System.out.println("- Total number of people: " + totalCount);
            System.out.println("- Sum of ages: " + sumOfAges);
            System.out.println("- Average age: " + averageAge);
            System.out.println("- Age Group Statistics:");
            System.out.println("  * Children: " + children + " person(s)");
            System.out.println("  * Teenagers: " + teenagers + " person(s)");
            System.out.println("  * Adults: " + adults + " person(s)");
            System.out.println("  * Seniors: " + seniors + " person(s)");
        }
    }


