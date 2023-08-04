package Inheritance;

class Superclass {
    public void method1() {
        System.out.println("Superclass method1.");
    }

    public void method2() {
        System.out.println("Superclass method2");
    }
}

class Subclass extends Superclass {

    @Override
    public void method2() {
        System.out.println("Subclass method2.");
    }

    public void method3() {
        System.out.println("Subclass method3");
    }
}

public class DynamicMethodDispatchRuntimePolymorphism {

    public static void main(String[] args) {
        /*Subclass sub = new Subclass();
        sub.method1();
        sub.method2(); // Subclass method2
        sub.method3();*/

        Superclass supb = new Subclass();
        supb.method1();
        supb.method2(); // overrided method of subclass is called at runtime (depending on the object, not reference type)
    }
}
