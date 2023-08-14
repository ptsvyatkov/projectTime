package multithreading;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        setPriority(Thread.MIN_PRIORITY+2);
    }

    @Override
    public void run(){
        int count = 1;
        while (count <= 100) {
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
}

public class ThreadMethodsExamples {
    public static void main(String[] args) {
        Thread t = new MyThread("My thread");
        t.start();
        t.interrupt();

        /*System.out.println("ID "+t.getId());
        System.out.println("Name "+t.getName());
        System.out.println("Priority "+t.getPriority());
        t.start();
        System.out.println("State "+t.getState());
        System.out.println("Is alive "+t.isAlive());*/

    }
}
