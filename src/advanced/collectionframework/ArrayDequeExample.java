package collectionframework;

import java.util.*;

public class ArrayDequeExample
{
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        //Using as a stack (LIFO) or Queue (FIFO)
        dq.offerLast(10);   // |  |  |10|  |  |  |
        dq.offerLast(20);   // |  |  |10|20|  |  |
        dq.offerLast(30);   // |  |  |10|20|30|  |
        dq.offerLast(40);   // |  |  |10|20|30|40|
        dq.forEach((x)-> System.out.print(x+" "));
        // if we use as a Stack, we delete from the last, LIFO -> Last in was 40 is first to be out (deleted)
        //dq.pollLast();          // |  |  |10|20|30|  |
        System.out.println();

        // if we use as a Queue, we delete from the first (10 was first to be added and to be deleted)
        dq.pollFirst();             // |  |  |20|30|40|  |
        dq.forEach((x)-> System.out.print(x+" "));



//        dq.offerFirst(1);
//        dq.offerFirst(2);
//        dq.offerFirst(3);
//        dq.offerFirst(4); // Last in is the first


    }
}
