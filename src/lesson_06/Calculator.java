package lesson_06;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1е число: ");
        float num1 = scan.nextFloat();
        System.out.print("Введите 2е число: ");
        float num2 = scan.nextFloat();
        System.out.print("Действие: ");
        String action = scan.next();
        float res;
        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error");
                } else {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                }
                break;
            default:
                System.out.println("Некорректные данные");
        }
    }
}
