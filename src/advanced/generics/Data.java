package generics;

public class Data<T> {  // Generic class, T is used as Template, but in Java it's used for Objects
    private T obj;

    public T getObj() {
        return obj;
    }
    public void setObj(T v) {       // takes object of Type Generic and assigns it to obj (line 4)
        this.obj = v;
    }

    public static void main(String[] args) {
        Data<Integer> d = new Data<>();
        d.setObj(10);
        d.setObj(15);
        Data<String> dStr = new Data<>();
        dStr.setObj("Hello");
    }
}
