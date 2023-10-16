package Comparable_Priority_queue;

public class Car implements Comparable{
    String name;
    int speed;
    int price;

    public Car(String name, int speed, int price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        Car other = (Car) o;
        return this.speed - other.speed;
    }

    @Override
    public String toString() {
        return "[" + this.name + " + " + this.speed + " + " + this.price + "]";
    }
}
