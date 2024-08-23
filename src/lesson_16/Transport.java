package lesson_16;

public abstract class Transport {

    protected float speed;
    private int weight;
    private String color;
    private byte[] coordinates;

    public Transport(float speed, int weight, String color, byte[] coordinates) {
        System.out.println("Object created");
        setValues(speed, weight, color, coordinates);
    }

    public Transport(int weight, byte[] coordinates) {
        System.out.println("Object created");
        this.weight = weight;
        this.coordinates = coordinates;
    }

    public abstract void moveObject(float speed);
    public abstract String stopObject();

    protected void setValues(float speed, int weight, String color, byte[] coordinates) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
    }

    protected String getValues() {
        String info = "speed: " + speed + ", weight: " + weight + ", color: " + color;
        String infoCoordinates = "coordinates:";
        for (int i = 0; i < coordinates.length; i++) {
            infoCoordinates += " " + coordinates[i];
        }
        return info + ", " + infoCoordinates;
    }

}
