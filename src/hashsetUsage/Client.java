package hashsetUsage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
//        HashSet<Point> hs = new HashSet();
//        hs.add(new Point(1,2));
//        hs.add(new Point(1,2));
//        hs.add(new Point(3,4));
//
//        System.out.println(hs);

        List<Integer> lst = Stream.of(1,2,3).collect(Collectors.toList());
        List<String> list = new ArrayList<>(Arrays.asList("a", "b")) ;
        lst.add(4);
        list.add("i");
        System.out.println(list);

    }
}
