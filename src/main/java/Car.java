public class Car {
    String name;
    double speed;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }
}
