package AnotherFolder;

import java.util.List;

public class user {
    int a = 10;
    List <Integer> lst;
    public user(){}
    public user(user other){
        this.lst = other.lst;
    }

    @Override
    public String toString() {
        return ""+lst+"" ;
    }
}
