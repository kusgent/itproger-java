package lesson_17;

public abstract class Transport {

    protected float speed;
    private int weight;
    private byte[] coordinates;

    public Transport(int weight, byte[] coordinates) {
        this.weight = weight;
        this.coordinates = coordinates;
    }

    public abstract void moveObject(float speed);

    class Engine {

        private boolean isReady;
        private int odo;

        public void setValues(boolean isReady, int odo) {
            this.isReady = isReady;
            this.odo = odo;
        }

        public void isReady(boolean isReady) {
            this.isReady = isReady;
        }

        public void info() {
            if (isReady) {
                System.out.println("Двигатель исправен");
            } else {
                System.out.println("Двигатель неисправен, пробег составляет " + odo + " км");
            }
        }

    }

}
