package iostreams;
import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) throws Exception {

//        File f = new File("./src/advanced/iostreams");
//        System.out.println(f.isDirectory());
//        //String[] str =  f.list(); // list all files as Strings
//        File[] str =  f.listFiles();
//
//        for(File el : str) {
//            System.out.println(el.getName());
//            System.out.println(el.getPath());
//        }

        File f2 = new File("./src/advanced/iostreams/TestData.txt");
        //f2.setReadOnly();
        f2.setWritable(true);;
        FileOutputStream fos = new FileOutputStream("./src/advanced/iostreams/TestData.txt");
    }
}
