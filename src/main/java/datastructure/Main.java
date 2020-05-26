package datastructure;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        MultiMap map = new MultiMap();
        map.put("hello", "world");
        map.put("foo", "bar");
        map.put("hello", "propra");
        Collection values = map.values();
        for (Object v: values) {
            System.out.println(v);
        }
        System.out.println();
        System.out.println(map.containsKey("foo"));
        System.out.println(map.containsKey("bar"));

        // Darf nicht mehr kompilieren!
        map.put(13,"x");

    }


}
