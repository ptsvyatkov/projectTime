package collectionframework;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40));
        // Collection<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40)); // possible, methods like ceiling and floor are not available
        // SortedSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40)); // reference of an interface can hold an object which is implementing that interface

        ts.add(25);
        ts.ceiling(55); // will return nearest greater number to 55
        ts.forEach((System.out::println));
    }
}
