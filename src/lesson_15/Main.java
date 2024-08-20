package lesson_15;

public class Main {

    public static void main(String[] args) {

        Truck truck = new Truck(4500, new byte[] {100, 0, 100}, false);
        truck.setValues(59.3f, 1500, "White", new byte[] {0, 0, 0}, true);
        System.out.println(truck.getValues());

    }

}
