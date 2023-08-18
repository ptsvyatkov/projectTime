package annotations;

class Parent {
    public void display(){};

    @Deprecated
    public void show(){};
}
class Child extends Parent {
    @SuppressWarnings("deprecation")
    @Override
    public void display() {

    }
}

class My<T>{
    @SafeVarargs
    private void show(T...args){
        for (T el : args) {
            System.out.println(el);
        }
    }
}

@FunctionalInterface    // Common type of interface, having one single method -> for defining lambda expression
interface My2 {
    public void show();
}

public class BuiltInAnnotations {

    public static void main(String[] args) {

    }

}
