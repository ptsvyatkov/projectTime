package InnerClasses;

class Outer2 {
    int x = 10;
    static int y = 20;

    static class My2 {
        public void show() {
         //   System.out.println(x + " " + y);    // Cannot access non-static member x

        }
    }

}

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer2.My2 o2m2 = new Outer2.My2();
        o2m2.show();
    }
}
