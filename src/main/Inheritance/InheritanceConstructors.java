package Inheritance;

class Parent {

    public Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("Grand Child");
    }
}

public class InheritanceConstructors {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
    }
}
