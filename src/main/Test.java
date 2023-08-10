import PackagesAccessModifiers.Example;

class Example4 extends Example {
    Example e = new Example();
    public void show() {
        //  System.out.println(a+b+c+d);        -> a,b not accessible
    }
    public static void main(String[] args) {
        Example4 ex4 = new Example4();
        ex4.show();
    }
}

public class Test {
    public static void main(String[] args) {
        Example ex = new Example();
       // System.out.println(ex.a+ex.b+ex.c+ex.d); -> a,b,c not accessible
    }
}
