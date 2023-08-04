package Inheritance;

class A {};
class B extends A{}

class SuperDisplay {                                //  -> A is superclass and B is subclass
    protected A display() {                            // If return type here is A, so superclass method returns object of A, -> check line 16 beginning
        System.out.println("Super Display.");
        return new A();
    }
}                                                   // static and final methods cannot be overrided

// Most restrictive -> private, protected, public <- Least restrictive access modifier
// The method overriden in the subclass can have the same or less restrictive access modifier than that in the superclass
class SubDisplay extends SuperDisplay{
    @Override                                           // ! Return type can be different in one situation -> See class A and B above
    // then subclass overridden method can return type B
    public B display() {                                // Signature must be exactly same as in superclass (parameter list and return type)
        System.out.println("Sub Display.");             // public void display(int x) not allowed if we use @Override -> this is overloading, not overriding
        return new B();
    }
}

public class OverridingRules {

    public static void main(String[] args) {

    }
}
