package iostreams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamExample{
    public static void main(String[] args) throws Exception{

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');

        /*byte[] b = bos.toByteArray();
        for (byte el : b) {
            System.out.print((char) el);
        }*/

        // write to a new file
        bos.writeTo(new FileOutputStream("./src/advanced/iostreams/TestByteArray.txt"));

        bos.close();
    }
}
