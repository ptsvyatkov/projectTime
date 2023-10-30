package Inheritance;

class Parent {
    Parent() {
        System.out.println("Parent");
    }
    Parent(int x){
        System.out.println("Parameterized of Parent "+ x);
    }
    protected void parental(){
        System.out.println("parental");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child");
    }
    Child(int y){
        System.out.println("Parameterized of Child "+ y);
    }
}

class GrandChild extends Child {
    GrandChild() {
        System.out.println("Grand Child");
    }
    GrandChild(int z){
        System.out.println("Parameterized of GrandChild");
    }
    GrandChild(int x, int y){
        super(x);
        System.out.println("2 Param of Grandchild "+ y);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild(20, 40);
        Parent p = new Child();
        p.parental();
    }
}
