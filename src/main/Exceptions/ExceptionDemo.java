package Exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a=10,b=0,c;
        try {
            c = a / b; // Throws exception java.lang.ArithmeticException (divide by zero)
            System.out.println(c);
        } catch (ArithmeticException ae) {
            System.out.println("Cannot divide by zero. " +ae);
        }
        System.out.println("End.");
    }
}
