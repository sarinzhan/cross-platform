package lab5;

import java.util.Comparator;
import java.util.Objects;
import java.util.Queue;

public class Car implements  Comparable<Car>{
    String name;
    int capacity;

    public Car(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.capacity,o.capacity);
    }
}
