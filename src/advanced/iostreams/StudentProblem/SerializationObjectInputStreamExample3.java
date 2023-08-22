package iostreams.StudentProblem;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializationObjectInputStreamExample3 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("src/advanced/iostreams/StudentProblem/StudentEx3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        StudentSerializable s;
        s = (StudentSerializable) ois.readObject(); // produces binary data that object input stream can read
        System.out.println(s);

        ois.close();
        fis.close();
    }
}
