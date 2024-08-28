package lesson_19;

public class Transport {

    private float speed;
    private int weight;
    private String color;
    private byte[] coordinates;

    public Transport(float speed, int weight, String color, byte[] coordinates) {
        setValues(speed, weight, color, coordinates);
        System.out.println(getValues());
    }

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
