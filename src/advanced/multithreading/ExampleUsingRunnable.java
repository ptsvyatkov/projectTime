package multithreading;

public class ExampleUsingRunnable implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i<10){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
class TestUsingRunnable {
    public static void main(String[] args) {
        ExampleUsingRunnable eur = new ExampleUsingRunnable();
        Thread t = new Thread(eur);
        t.start();
        int i = 0;
        while (i<10){
            System.out.println(i+" World");
            i++;
        }
    }
}
