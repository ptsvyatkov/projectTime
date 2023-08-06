package InnerClasses;

// for Example 2 and 3
interface My {
    public void show();
}

/*
    // for Example 2 and 3
    abstract class My {
        abstract public void show();
    }
*/

class Outer1 {
    public void display() {

        //                                                                   # Example 3
        // Anon object and class inheriting from class My
        new My() { public void show() {System.out.println("Hello");}}.show();      // ---> written as lambda ((My) () -> System.out.println("Hello")).show();

        /*                                                                   # Example 2
        My m = new My() {
            @Override
            public void show() {System.out.println("Hello");}
        };
        m.show();*/



        /*
        class  Inner1 {                                                 //   # Example 1
            public void show() {
                System.out.println("Hello from Inner1.");
            }
        }
        new Inner1().show(); // anon-object
        */
    }
}


public class LocalInner {
    public static void main(String[] args) {
        Outer1 o1 = new Outer1();
        o1.display();
    }
}
