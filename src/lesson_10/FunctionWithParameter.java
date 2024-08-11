package lesson_10;

public class FunctionWithParameter {
    public static void main(String[] args) {
        info("Hello");
        String java = "Java";
        info(java);
        info("");
    }
    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");
    }
}
