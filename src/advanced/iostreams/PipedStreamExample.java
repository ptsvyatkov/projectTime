package iostreams;

import java.io.*;

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream os) {
        this.os = os;
    }

    @Override
    public void run() {
        int count = 1;

        while (true) {
            try {
                os.write(count);
                os.flush();
                Thread.sleep(10);
                System.out.println("Producer: " + count);
                count++;
            } catch (IOException | InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread {
    InputStream is;

    public Consumer(InputStream is) {
        this.is = is;

    }

    @Override
    public void run() {
        int x;

        while (true) {
            try {
                x = is.read();
                System.out.println("Consumer: " + x);
                System.out.flush();
            } catch (IOException e) {
                System.out.println(e);
            }
    }
}
}

public class PipedStreamExample {
    public static void main(String[] args) throws IOException {

        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pis.connect(pos);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
        p.start();
        c.start();

    }
}
