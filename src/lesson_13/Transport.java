package lesson_13;

public class Transport {

    private float speed;
    private int weight;
    private String color;
    private byte[] coordinates;

    public Transport(float speed, int weight, String color, byte[] coordinates) {
        System.out.println("Object created");
        setValues(speed, weight, color, coordinates);
        System.out.println(getValues());
    }

    public Transport(int weight, byte[] coordinates) {
        System.out.println("Object created");
        this.weight = weight;
        this.coordinates = coordinates;
        System.out.println(getValues());
    }

    public void setValues(float speed, int weight, String color, byte[] coordinates) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
    }

    public String getValues() {
        String info = "speed: " + speed + ", weight: " + weight + ", color: " + color;
        String infoCoordinates = "coordinates:";
        for (int i = 0; i < coordinates.length; i++) {
            infoCoordinates += " " + coordinates[i];
        }
        return info + ", " + infoCoordinates;
    }

}
