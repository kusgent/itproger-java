package lesson_17;

public class Truck extends Transport {

    private boolean isLoaded;

    public Engine engine = new Engine();

    public Truck(int weight, byte[] coordinates, boolean isLoaded) {
        super(weight, coordinates);
        this.isLoaded = isLoaded;
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается со скоростью " + speed);
    }

}
