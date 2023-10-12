package StrategyDesignPattern;

public class Client {
    public static void main(String[] args) {
        PathTravel pt = new PathTravel();
        pt.createFactory("Bike").vehicle();
    }
}
