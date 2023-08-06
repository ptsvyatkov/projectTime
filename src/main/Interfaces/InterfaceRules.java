package Interfaces;

interface ITest {

    int X = 10; // identifiers are allowed, they are constant (static and final) but need to be in UPPERCASE
    static final int Y = 11;

    void method1(); // Methods are public and default automatically
    abstract public void method2();

    private void method3(){                  // Can be private from java9+, default methods will use it
        System.out.println("Method 3 of ITest");
    };

    default void method4() {
        method3();                          // Cannot have body unless defined static -> default
    }

}

interface ITest2 extends ITest {            // interfaces can be extended
    void method5();
}

class MyClass implements ITest2 {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method5() {

    }
}

public class InterfaceRules {
    public static void main(String[] args) {
        System.out.println(ITest.X);

        MyClass mc = new MyClass();
        mc.method4();
    }
}
