package lesson_17;

public class Main {

    public static void main(String[] args) {

        Truck truck = new Truck(4500, new byte[] {100, 0, 100}, false);
        truck.engine.setValues(false, 1000000);
        truck.engine.info();

        Truck flyTruck = new Truck(5000, new byte[] {120, 0, 120}, true) {
            @Override
            public void moveObject(float speed) {
                this.engine.isReady(true);
                super.moveObject(speed);
                System.out.println("Грузовик летит");
            }
        };

        flyTruck.moveObject(700);

    }

}
