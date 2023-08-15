package multithreading;

class MyData {
    void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
class MyThread1 extends Thread {
    MyData d;
    MyThread1(MyData data) {
        d = data;
    }
    @Override
    public void run() {
        d.display("Hello World");
    }
}

class MyThread2 extends Thread {
    MyData data;
    MyThread2(MyData data) {
        this.data = data;
    }

    @Override
    public void run() {
        data.display("Welcome");
    }
}

public class MultithreadingNoSynchronization {
    public static void main(String[] args) {
        MyData data = new MyData();
        MyThread1 t1 = new MyThread1(data);
        MyThread2 t2 = new MyThread2(data);
        t1.start();
        t2.start();
    }
}
