package multithreading;

class MyData2 {

    synchronized void display(String str) {             // synchronized method -> now no thread can enter if already in use
    //        synchronized (this) {                     // synchronize block
            for (int i = 0; i < str.length(); i++) {    /*
                System.out.println(str.charAt(i));      Critical section */
            }
        }
    // }
}


class MyThread3 extends Thread {
    MyData2 d;

    MyThread3(MyData2 data) {
        d = data;
    }

    @Override
    public void run() {
        d.display("Hello World");
    }
}

class MyThread4 extends Thread {
    MyData2 data;

    MyThread4(MyData2 data) {
        this.data = data;
    }

    @Override
    public void run() {
        data.display("Welcome");
    }
}

public class MultithreadingWithSynchronization {
    public static void main(String[] args) {
        MyData2 data = new MyData2();
        MyThread3 t3 = new MyThread3(data);
        MyThread4 t4 = new MyThread4(data);
        t3.start();
        t3.start();
    }
}
