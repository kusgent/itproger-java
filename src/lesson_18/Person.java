package lesson_18;

public class Person {

    private static int count;
    public int num = 3;

    public Person() {
        count++;
    }

    public static void getCount() {
        System.out.println(count);
//        this.num = 5;
    }

}
