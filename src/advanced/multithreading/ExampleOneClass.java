package multithreading;

public class ExampleOneClass extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        ExampleOneClass eoc = new ExampleOneClass();
        eoc.start();
        int i = 0;
        while (i < 10) {
            System.out.println(i+" world");
        }
    }
}
