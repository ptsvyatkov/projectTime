package iostreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) {
        try {
            try (FileOutputStream fos = new FileOutputStream("./src/advanced/iostreams/Test.txt");) {

                String str = "file output stream";
                byte[] b = str.getBytes();
                // fos.write(str.getBytes());           Example#1


                // for (byte el : b) {
                //    fos.write(el);
                // }

                // fos.write(b,0,str.length()-6);

                fos.write(b);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    };
}
