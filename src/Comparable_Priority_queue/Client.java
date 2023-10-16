package Comparable_Priority_queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Client {
    public static void main(String[] args) {

        PriorityQueue<Car> pq = new PriorityQueue<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Car c1 = new Car("Q",20,500);
        Car c2 = new Car("W",30,400);
        Car c3 = new Car("E", 40, 300);
        Car c4 = new Car("R", 50, 200);


        pq.add(c1);
        pq.add(c2);
        pq.add(c3);
        pq.add(c4);


        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }







    }
}
