package az.edu.turing.Array.task;

import java.util.Arrays;

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


                int[] nums = {1,2,3,5,48,-82};

                System.out.println();

            }
        }
