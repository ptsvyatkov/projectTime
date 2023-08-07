package PackagesAccessModifiers;

// Check Test class in main folder
class Example2 {
    Example e = new Example();

    public void show() {
   //   System.out.println(e.a+e.b+e.c+e.d); // b not allowed, as it is private.
    }
}

class Example3 extends Example {
    Example e = new Example();

    public void show() {
    //  System.out.println(e.a, e.b, e.c, e.d); // b not allowed, as it is private
    }
}

public class Example {
    int a = 10;
    private int b = 20;
    protected int c = 30;
    public int d = 40;

    public void display() {
        System.out.println(a+b+c+d);
    }
}
