package StrategyDesignPattern;

public class Path_mode_Factory {
    static Path_mode getMode(String mode){
        if(mode.equals("Bike")){
            return new Bike();
        } else if(mode.equals("Car")) {
            return new Car();
        }
        return null;
    }

}
