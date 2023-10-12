package AnotherFolder;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        user u = new user();
        u.lst = new ArrayList<>();
        u.lst.add(1);
        u.lst.add(2);
        u.lst.add(3);

        System.out.println(u);

        user u_new = new user(u);
        u.lst.add(4);
        System.out.println(u);
        System.out.println(u_new);



    }
}
