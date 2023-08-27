package collectionframework;

import java.util.*;

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return 1;
        if (o1 > o2)
            return -1;
        return 0;
    }
}

public class PriorityQueueExample
{
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator());
        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);
        System.out.println("Head element: "+pq.peek());
        pq.forEach((x)-> System.out.println("x = " + x));
        pq.poll();
        System.out.println("After deletion");
        pq.forEach((x)-> System.out.println("x = " + x));
    }
}
