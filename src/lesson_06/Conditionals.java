package lesson_06;

public class Conditionals {
    public static void main(String[] args) {
        int a = 1, b = 10;
        boolean isHasCar = false;
        if (a >= b || isHasCar) {
            System.out.println("Да, верно");
        } else if (isHasCar && a == b) {
            System.out.println("Second test");
        } else {
            System.out.println("Нет, не верно");
        }
    }
}
