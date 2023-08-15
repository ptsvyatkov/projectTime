package multithreading;

class OuterThread extends Thread {
    public void run() {
        int count = 1;
        while (count<=500){
            System.out.println(count++ +" Outer thread");

        }
    }
}

public class DaemonJoinYieldExample {

    public static void main(String[] args) throws Exception {
        OuterThread ot = new OuterThread();
        /* ot.setDaemon(true);
        ot.start();
        Thread mainThread = Thread.currentThread();
        mainThread.join(); // main will now join daemon thread and wait for it to finish
        */
        ot.start();
        int count = 1;
        while(count<=500) {
            System.out.println(count++ +" main thread");
            Thread.yield(); // will make main thread to give time to the other thread
        }

    }

}
