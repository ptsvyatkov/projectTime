package generics;

class A{}
class B extends A{}
class C extends B{}

public class MyArray<T> {
    T[] array = (T[]) new Object[10];
    int length = 0;
    public void append(T v){
        array[length++] = v; // store at index 0 initially and then increment
    }

    public void display() {
        for(int i = 0; i<length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        MyArray<C> ma = new MyArray<>();
    }
}

class GenericDemo {

    /*static <E extends Number> void show(E[] array) {
        for (E x : array){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        show(new String[]{"Hi", "Go", "Bye"});
        show(new Integer[]{1,2,3,4,5});
    }*/

    static void fun(MyArray<String> obj) {
        obj.display();
    }

    public static void main(String[] args) {
        MyArray<String> ma1 = new MyArray<>();
        MyArray<String> ma2 = new MyArray<>();
        fun(ma1);
        fun(ma2);
    }
}
