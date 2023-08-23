package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(20);
        List<Integer> al2 = new ArrayList<>(List.of(1,2,3,4));
        al.add(10);
        al.add(0,5);
        al.addAll(1, al2);
        al.add(5,3);
        al.set(5,100);
//        System.out.println(al.contains(25));
//        System.out.println(al);
//        System.out.println(al.get(5));
//        System.out.println(al.indexOf(4));
//        System.out.println(al.lastIndexOf(3));
//        System.out.println(al);

//        for (int i = 0; i < al.size(); i++) {
//            System.out.println(al.get(i));
//        }

//        for (Integer el : al) {
//            System.out.println(el);
//        }

//        for (Iterator<Integer> iterator = al.iterator(); iterator.hasNext(); ) {
//            Integer el = iterator.next();
//            System.out.println(el);
//        }

//        al.forEach((x) -> System.out.println(x));

//          Iterator<Integer> it = al.iterator();
//
//          while (it.hasNext()){
//              System.out.println(it.next());
//          }

//        ListIterator<Integer> it = al.listIterator();
//        while (it.hasNext()){
//            it.hasPrevious();
//        }

//        for(ListIterator<Integer> it = al.listIterator(); it.hasNext(); ){
//            System.out.println(it.next());
//        }

        al.forEach(n-> System.out.println(n));
        al.forEach(System.out::println);
        al.forEach(n->show(n));
    }
    static void show(int n){
        if (n>60){
            System.out.println(n);
        }
    }
}
