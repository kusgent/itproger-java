package lesson_14;

public class Truck extends Transport {
    private boolean isLoaded;

    public Truck(int weight, byte[] coordinates) {
        super(weight, coordinates);
    }

    public Truck(int weight, byte[] coordinates, boolean isLoaded) {
        super(weight, coordinates);
        this.isLoaded = isLoaded;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public void getLoaded() {
        if (isLoaded) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Грузовик не загружен");
        }
    }
}
