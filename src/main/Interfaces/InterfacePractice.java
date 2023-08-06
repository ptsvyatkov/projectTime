package Interfaces;

interface Test {
    void method1();
    void method2();
}

class My implements Test {

    @Override
    public void method1() {
        System.out.println("Class My Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Class My Method 2");
    }

    public void method3() {
        System.out.println("Class My Method3 ");
    }
}

public class InterfacePractice {

    public static void main(String[] args) {
        Test t = new My();
        t.method1(); // runtime polymorphism
        t.method2();
        ((My) t).method3();
    }

}
