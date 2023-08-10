package StaticAndFinal;

class StaticTest {
    static int x = 10;
    int y = 20;

    void show() {
        System.out.println(x+" "+y);
    }

    static void display() {
        System.out.println(x);
     // System.out.println(y); // non-static field cannot be accessed by static method
    }
}

public class StaticVarsAndMethods {
    public static void main(String[] args) {
        StaticTest st = new StaticTest();
        st.x = 30;
        st.show();

        StaticTest st2 = new StaticTest();
        st2.show();
    }
}
