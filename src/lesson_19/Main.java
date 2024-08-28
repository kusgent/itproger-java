package lesson_19;

public class Main {

    public static void main(String[] args) {
        Car haval = new Car(200.3f, 1300, "red", new byte[] {100, 0, 100});

        haval.setLight(true);
        haval.blinkLight();
    }

}
