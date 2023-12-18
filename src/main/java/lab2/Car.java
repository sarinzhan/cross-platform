package lab2;

public class Car {
    private int weight;
    private int maxSpeed;
    private String name;

    public Car(int weight, int maxSpeed, String name) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
