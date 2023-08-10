package Exceptions;

class NegativeDimensionException extends Exception {
    @Override
    public String toString() {
        return "Dimensions of a rectangle cannot be negative.";
    }
}

public class ThrowVsThrowsExample {

    static int area(int l, int b) throws NegativeDimensionException {
        if(l<0 || b<0)
            throw new NegativeDimensionException(); // -> need to add throws Exception to method signature -> line 12
        return l*b;
    }

    static void method1 () throws NegativeDimensionException {
        System.out.println("Area is: "+area(-10,5)); // now we need to catch here or declare that the method throws exception
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }

    }

}
