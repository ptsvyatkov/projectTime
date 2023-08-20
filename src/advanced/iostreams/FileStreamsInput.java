package iostreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamsInput {

    public static void main(String[] args) {
        try {
            try (FileInputStream fis = new FileInputStream("./src/advanced/iostreams/Test.txt");) {
                /*
                byte[] b = new byte[fis.available()]; // Creating a byte array equal to the available bytes inside file
                fis.read(b);
                String str = new String(b);
                System.out.println(str);
                */

                // byte by byte
                int x;
                while ((x=fis.read())!=-1){
                        System.out.print((char) x);
                }

            }
        } catch (IOException e) {
            System.out.println(e);
        }
    };
}
