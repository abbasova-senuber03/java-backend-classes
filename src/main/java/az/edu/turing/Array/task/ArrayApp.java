package az.edu.turing.Array.task;

public class ArrayApp {
    public static void main(String[] args) {
                int[] arr = {12, 45, 23, 67, 34, 89, 22};
                int maxNum = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > maxNum) {
                        maxNum = arr[i];
                    }
                }
                System.out.println("En boyuk eded " + maxNum);
            }
        }
