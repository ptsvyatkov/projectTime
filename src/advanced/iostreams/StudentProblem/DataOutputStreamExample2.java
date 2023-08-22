package iostreams.StudentProblem;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamExample2  {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("./src/advanced/iostreams/StudentProblem/StudentEx2.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        Student s = new Student();
        s.rollno = 10;
        s.name = "John";
        s.dept = "CSE";
        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
        dos.close();
        fos.close();
    }
}
