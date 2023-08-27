package collectionframework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>(List.of(10,20,30,40,50));

        list.add(10);
        list.add(0, 5);
        list.addAll(list2);
        list.set(6, 100);
        list.addFirst(3);
        list.addLast(100);
        list.forEach(n-> System.out.println(n));
        list.get(1);
        list.peek();

    }
}
