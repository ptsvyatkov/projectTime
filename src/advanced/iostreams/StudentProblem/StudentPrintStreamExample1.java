package iostreams.StudentProblem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class StudentPrintStreamExample1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./src/advanced/iostreams/Student.txt");
        PrintStream ps = new PrintStream(fos); // ps attached to file output stream which is attached to a file |ps|->|fos|->|file
        Student s = new Student();
        s.rollno = 10;
        s.name = "John";
        s.dept = "CSE";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();
    }
}
