package javalang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class My {
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {

    }

    public My(int x, int y) {

    }

    public void display(String s1, String s2) {

    }

    public int show(int x, int y) {
        return 0;
    }

}

public class ReflectionExample {
    public static void main(String[] args) {
        Class c = My.class;
        System.out.println(c.getName());
        Field[] field = c.getDeclaredFields();
        Constructor[] constructors = c.getConstructors();
        Method[] methods = c.getMethods();

        for (Field f : field) {
            System.out.println(f);
        }

        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        for (Method m : methods) {
            System.out.println(m);
        }

        Parameter[] param = methods[0].getParameters();

        for (Parameter p : param) {
            System.out.println(p);
        }
    }
}
