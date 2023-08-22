package generics;

@SuppressWarnings("unchecked")
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
        MyArray<Integer> ma = new MyArray<>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.display();
    }
}
