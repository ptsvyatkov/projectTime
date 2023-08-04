package Abstract;

abstract class Super {

    public Super(){
        System.out.println("Super constructor.");
    }

    void method1() {
        System.out.println("Super method 1.");
    }

    abstract void method2();
}

class Sub extends Super{
    @Override
    void method2() {
        System.out.println("Sub method 2");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Super s = new Super();               // not allowed -> abstract classes cannot be instantiated
        Super s = new Sub();
        s.method1();
        s.method2();
    }
}
