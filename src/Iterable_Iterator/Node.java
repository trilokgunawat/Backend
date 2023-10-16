package Iterable_Iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Node implements Iterable<Integer>{
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NodeIterator(this);
    }

   public static class NodeIterator implements Iterator<Integer>{
        Node temp;
       public NodeIterator(Node node) {
           this.temp = node;
       }

       @Override
       public boolean hasNext() {
           if(temp != null){
               return true;
           }
           return false;
       }

       @Override
       public Integer next() {
           Integer val =  temp.data;
           temp = temp.next;
           return  val;
       }
   }
}
