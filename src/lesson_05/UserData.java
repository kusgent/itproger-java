package lesson_05;

import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String user_name = scan.nextLine();
        System.out.println("Привет, " + user_name + "!");
        int num1 = scan.nextInt();
        byte num2 = scan.nextByte();
        boolean b = scan.nextBoolean();
        float f = scan.nextFloat();
    }
}
