package collectionframework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"A", 1, "B", 2, "C", 3, "D"));
        tm.put(4,"E");
        tm.put(5,"G");
        System.out.println(tm);
        System.out.println(tm.ceilingEntry(5).getValue());
    }
}
