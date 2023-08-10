package Exceptions;

public class NestedCatchExample {
    public static void main(String[] args) {

        int[] a={30,20,10,40,0};
        try {
            int c = a[0] / a[2]; // Will throw divide by zero exception if we divide by a[4]
            System.out.println("Result is: " + c);

            try {
                System.out.println(a[5]); // Throws exception array out of bounds exception as array length is only 5.
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index is invalid");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");}

        System.out.println("End.");
    }
}
