package Inheritance;

class Super {
    void display(){
        System.out.println("Hello.");
    }
}

class Sub extends Super {
    @Override
    void display(){
        System.out.println("Hey there." );
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display(); // Hello.

        Sub sub = new Sub();
        sub.display(); // Hey there.

        // !!! The method of the object will be called, not the method of the reference
        // Dynamic Event Dispatch
        Super subp = new Sub();
        subp.display(); // Hey there.

    }
}
