package lesson_18;

public class Main {

    public static void main(String[] args) {

        info("Hello", "5");

//        Person person = new Person();
//        Person.count = 5;
//        System.out.println(Person.count);

        Person obj1 = new Person();
        Person.getCount();
        Person obj2 = new Person();
        Person.getCount();
        Person obj3 = new Person();
        Person.getCount();
        Person obj4 = new Person();
        Person.getCount();
        Person obj5 = new Person();
        Person.getCount();

        final int count = 10;
//        count++;

    }

    public static void info() {
        System.out.println("Hello!");
    }

    public static void info(String word) {
        System.out.println(word + "!");
    }

    public static void info(int num) {
        System.out.println(num);
    }

    public static void info(String word, String num) {
        System.out.println(word + ", " + num);
    }

}
