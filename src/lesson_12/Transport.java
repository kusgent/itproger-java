package lesson_12;

public class Transport {

    public float speed;
    public int weight;
    public String color;
    public byte[] coordinates;

    public void setValues(float _speed, int _weight, String _color, byte[] _coordinates) {
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinates = _coordinates;
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
