package lesson_19;

public class Car extends Transport implements ILights {

    private boolean isOn;

    public Car(float speed, int weight, String color, byte[] coordinates) {
        super(speed, weight, color, coordinates);
    }

    @Override
    public void setLight(boolean set) {
        isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("Мы моргаем фарами");
    }
}
