package Exceptions;

public class ExceptionPropagationExample {

    static int method1() {
        return 10/0;        // unchecked exception -> in case it is not caught anywhere, program will crash
    }                       // stack main -> method3 -> method2 -> method1

    static void method2() {
        method1();
    }

    static void method3() {
        method2();
    }

    public static void main(String[] args) {
        method3();
        /*try {
            method3();
        } catch (Exception e) {
            System.out.println(e);
        }*/

    }

}
