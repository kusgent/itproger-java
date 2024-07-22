package lesson_06;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите роль: ");
        String role = scan.nextLine();
        System.out.print("Введите пароль: ");
        String pass = scan.nextLine();
        if (role.equals("admin") && pass.equals("12345")) {
            System.out.println("Все пользователи");
        } else {
            System.out.println("Привет, как вас зовут?");
            String name = scan.nextLine();
        }
    }
}
