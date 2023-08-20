package iostreams;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) throws Exception {
        byte[] b ={'a','b','c','d','e','f','g','h','i','j','k','l'};

        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        int x;

        /*
        while((x=bis.read()) != -1 ){               Reading one byte at a time.
            System.out.print((char) x);
        }
        */
        System.out.println(bis.markSupported());
        String str = new String(bis.readAllBytes());
        System.out.println(str);
        bis.close();
    }

}
