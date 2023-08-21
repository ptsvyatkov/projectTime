package iostreams;
import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws Exception
    {
        FileReader fis = new FileReader("./src/advanced/iostreams/TestBufferedInputStream.txt");
        BufferedReader bis = new BufferedReader(fis);

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10); // will be valid up to 10 letters
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.println(bis.readLine());
        bis.close();
        fis.close();
    }
}
