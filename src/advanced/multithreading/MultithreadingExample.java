package multithreading;

public class MultithreadingExample extends Thread{
    public void run() {
        int i = 1;
        while (i < 6) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}
class TestMultithread {
    public static void main(String[] args) {
        MultithreadingExample me = new MultithreadingExample();
        me.start();
        int i = 1;
        while (i < 6) {
            System.out.println(i+" world");
            i++;
        }
    }
}