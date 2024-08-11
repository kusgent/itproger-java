package lesson_10;

public class SumFunction {
    public static void main(String[] args) {
        sum((short) 5, (short) 6);
        sum((short) 11, (short) 555);
    }
    public static void sum(short a, short b) {
        int res = a + b;
        String result = "Результат: " + res;
        info(result);
    }
    public static void info(String word) {
        System.out.println(word);
    }
}
