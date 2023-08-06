package InnerClasses;

class Outer {
    int x = 10;
    Inner i = new Inner(); // available for entire class

    class Inner {
        int y = 20;
        public void innerDisplay() {
            System.out.println(x+" "+y);
        }
    }

    public void outerDisplay() {
        i.innerDisplay();
        System.out.println(i.y);
    }

}


public class InnerClassExample {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();

        Outer.Inner ou = new Outer().new Inner();
        ou.innerDisplay();
    }
}
