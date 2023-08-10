package StaticAndFinal;

interface A {
    int x = 5;
    void method1();
}
final class FinalTest implements A{
    public final void show() {
        System.out.println("Hello");
    }

    @Override
    public void method1() {

    }
}

/*class FinalTest2 extends FinalTest {          // Not allowed -> cannot extend final classes
    public void show(){

    }
}*/

public class FinalDemo {
    final float PI;                      // directly initialize here #1 OR
    public FinalDemo()
    {
        PI = 3.1425f;                    // inside the constructor #2 OR
    }

    /*
    {
        PI = 3.1425f;                    // inside an instance block #3
    }
    */

    public static void main(String[] args) {

    }
}
