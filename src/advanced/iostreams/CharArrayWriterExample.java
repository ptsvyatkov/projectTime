package iostreams;

import java.io.*;

public class CharArrayWriterExample {
    public static void main(String[] args) throws IOException {
        CharArrayWriter cw = new CharArrayWriter(20);
        cw.write('a');
        cw.write('b');
        cw.write('c');

        FileWriter fw = new FileWriter("./src/advanced/iostreams/TestCharWriter.txt");

        cw.writeTo(fw);

        fw.flush();
        cw.close();
    }

}
