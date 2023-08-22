package iostreams.StudentProblem;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamExample2  {
    public static void main(String[] args) throws Exception {
        FileInputStream fos = new FileInputStream("./src/advanced/iostreams/StudentProblem/StudentEx2.txt");
        DataInputStream dos = new DataInputStream(fos);
        Student s = new Student();
        s.rollno = dos.readInt();
        s.name = dos.readUTF();
        s.dept = dos.readUTF();
        System.out.println(s.rollno+" "+s.name+" "+s.dept);
        dos.close();
        fos.close();
    }
}
