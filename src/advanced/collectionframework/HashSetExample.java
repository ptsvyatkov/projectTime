package collectionframework;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10); // only unique items

        hs.forEach(System.out::println); // Note, they are not printed in the same order they are inserted.
    }
}
