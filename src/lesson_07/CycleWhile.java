package lesson_07;

public class CycleWhile {
    public static void main(String[] args) {
        int i = 20;
        while (i > 10) {
            System.out.println("Element " + i);
            i--;
        }
        do {
            i += 10;
            System.out.println("Element " + i);
        } while (i > 20);
    }
}
