package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class CopyTwoFilesSequenceStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./src/advanced/iostreams/Test.txt");
            FileInputStream fis2 = new FileInputStream("./src/advanced/iostreams/Test2.txt");
            FileOutputStream fos = new FileOutputStream("./src/advanced/iostreams/Copyof2.txt");
            SequenceInputStream sqc = new SequenceInputStream(fis,fis2);

            int b;
            while ((b= sqc.read())!=-1){
                fos.write(b);
            }

            sqc.close();
            fis.close();
            fis2.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
