package lesson_14;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(59.3f, 1500, "White", new byte[] {0, 0, 0});

        Truck truck = new Truck(4500, new byte[] {100, 0, 100}, false);
        truck.setLoaded(true);
        truck.getLoaded();
    }

}
