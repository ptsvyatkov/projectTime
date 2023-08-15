package multithreading;

class MySharedData {
    int value;
    boolean flag = true;
    synchronized public void set(int v){
        while (flag!=true){
            try {
                wait();
            } catch (Exception e){}
        }
        value = v;
        flag = false;
        notify();
    }

    synchronized public int get() {
        int x = 0;
        while (flag!=false){
            try {
                wait();
            } catch (Exception e){}
        }
        x = value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread {
    MySharedData data;
    public Producer(MySharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        int count = 1;
        while (true){
            data.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}

class Consumer extends Thread {
    MySharedData data;
    public Consumer(MySharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        int value;
        while (true){
            value = data.get();
            System.out.println("Consumer "+value);
        }
    }
}

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        MySharedData data = new MySharedData();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        p.start();
        c.start();
    }
}
