package generics;


public class MyGenericArrayPracc<T> {
    T[] myArray = (T[]) new Object[5];
    int length;
    public void append(T value) {
        myArray[length++] = value;
    }
    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void main(String[] args) {
        MyGenericArrayPracc<Double> mga = new MyGenericArrayPracc<>();
        mga.append(10.3d);
        mga.append(22.44d);
        mga.display();
    }
}
