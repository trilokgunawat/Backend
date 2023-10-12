package StrategyDesignPattern;

public class PathTravel {
    Path_mode createFactory(String mode){
        return Path_mode_Factory.getMode(mode);
    }
}
