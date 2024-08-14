package lesson_12;

public class Main {

    public static void main(String[] args) {
        Transport car = new Transport();
        car.speed = 59.3f;
        car.weight = 1500;
        car.color = "White";
        car.coordinates = new byte[] {0, 0, 0};

        Transport truck = new Transport();
        truck.speed = 100.3f;
        truck.weight = 4500;
        truck.color = "Red";
        truck.coordinates = new byte[] {100, 0, 100};

        System.out.println("Car speed: " + car.speed + ".");
        System.out.println("Truck weight: " + truck.weight + ".");
    }

}
