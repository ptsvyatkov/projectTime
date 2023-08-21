package iostreams;
import java.io.*;
public class BufferedInputStreamExample {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("./src/advanced/iostreams/TestBufferedInputStream.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10); // will be valid up to 10 letters
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

        bis.close();
        fis.close();
    }
}
