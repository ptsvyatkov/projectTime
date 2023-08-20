package iostreams;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./src/advanced/iostreams/Test.txt");
            FileOutputStream fos = new FileOutputStream("./src/advanced/iostreams/Test2.txt");

            int b;
            while ((b= fis.read())!=-1){
                if (b>=65 && b<=120) {              // capital letters
                    fos.write(b+32);             // to lowercase letters
                } else {
                    fos.write(b);
                }
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
