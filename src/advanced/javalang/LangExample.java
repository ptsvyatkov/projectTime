package javalang;

import java.util.Random;

class MyObject {
    @Override
    public String toString() {
        return "My Object";
    }
    @Override
    public int hashCode() {
        return 5;
    }
    @Override
    public boolean equals(Object obj) {
        return this.hashCode()==obj.hashCode();
    }
}

class MyObject2 extends MyObject {

}

public class LangExample {
    public static void main(String[] args) {
        MyObject o = new MyObject();
        MyObject o2 = new MyObject();
        System.out.println(o.equals(o2));

        byte a = 13;
        Byte b = Byte.valueOf(a);

    }
}
