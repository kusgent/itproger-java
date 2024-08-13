package lesson_10;

public class ReturnData {
    public static void main(String[] args) {
        int result = sum((short) 6, (short) 2);
        info(String.valueOf(result));
    }
    public static int sum(short a, short b) {
        return a + b;
    }
    public static void info(String word) {
        System.out.println(word);
    }
}
