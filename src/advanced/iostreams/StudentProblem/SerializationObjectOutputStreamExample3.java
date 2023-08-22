package iostreams.StudentProblem;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationObjectOutputStreamExample3 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("src/advanced/iostreams/StudentProblem/StudentEx3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        StudentSerializable s = new StudentSerializable(10, "John", 91.1f, "CSE");
        oos.writeObject(s); // produces binary data that object input stream can read

        oos.close();
        fos.close();
    }
}
