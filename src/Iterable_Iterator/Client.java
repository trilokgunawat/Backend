package Iterable_Iterator;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Node n5 = new Node(5,null);
        Node n4 = new Node(4,n5);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);

        Iterator itr  = n1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
