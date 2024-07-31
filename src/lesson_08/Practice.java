package lesson_08;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите число: ");
            int val = scanner.nextInt();
            arr[i] = val;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное число: " + min);
    }
}
