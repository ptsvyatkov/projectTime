package iostreams;

import java.io.*;

public class StudentBufferedReaderExample1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/advanced/iostreams/Student.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis)); // bridge class InputStreamReader which will connect
        Student s = new Student();                                          // file output stream with reader (reader with stream classes)
        s.rollno =  Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();

        System.out.println("Rollno: "+s.rollno);
        System.out.println("Name: "+s.name);
        System.out.println("Dept: "+s.dept);
    }
}
