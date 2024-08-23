package lesson_16;

public class Truck extends Transport {
    private boolean isLoaded;

    public Truck(int weight, byte[] coordinates) {
        super(weight, coordinates);
    }

    public Truck(int weight, byte[] coordinates, boolean isLoaded) {
        super(weight, coordinates);
        this.isLoaded = isLoaded;
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается со скоростью " + speed);
    }

    @Override
    public String stopObject() {
        super.speed = 0;
        return "Объект остановлен";
    }

    public void setValues(float speed, int weight, String color, byte[] coordinates, boolean isLoaded) {
        super.setValues(speed, weight, color, coordinates);
        this.isLoaded = isLoaded;
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public String getLoaded() {
        if (isLoaded) {
            return "Грузовик загружен";
        } else {
            return "Грузовик не загружен";
        }
    }
}
