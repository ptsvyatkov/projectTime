package iostreams.StudentProblem;

import java.io.Serializable;

public class StudentSerializable implements Serializable {
    int rollno;
    String name;
    float avg;
    String dept;
    public static int data = 10;    // will not be serialized -> just stored as 10
    public transient int t;         // will not be serialized -> stored as 0

    public StudentSerializable(){}  // has to be present in order to serialize and de-serialize the SAME class

    public StudentSerializable(int r, String n, float a, String d){
        this.rollno = r;
        this.name = n;
        this.avg = a;
        this.dept = d;
        data = 500;
        t = 500;
    }

    @Override
    public String toString() {
        return "\nStudentDetails\n" +
                "\nrollno=" + rollno +
                "\nname=" + name +
                "\navg=" + avg +
                "\ndept=" + dept +
                "\ndata=" + data +
                "\ntransient=" + t +"\n";
    }
}
