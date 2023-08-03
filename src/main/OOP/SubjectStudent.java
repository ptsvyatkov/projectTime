package OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class SubjectStudent {

    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        Student students[] = new Student[1];
        subs[0] = new Subject(101, "DS", 100);
        subs[1] = new Subject(102, "Algo", 100);
        subs[2] = new Subject(103, "Networking", 100);
        students[0] = new Student(1337, "DJ", "Informatics", subs);
        students[0].setSubjects(subs[0]);
        for (Student x: students) {
            System.out.println(x.toString());
        }
    }
}

class Student{
    private int roleNo;
    private String name;
    private String dept;
    private Subject[] subjects;

    public Student(int roleNo, String name){
        this.roleNo = roleNo;
        this.name = name;
    }

    public Student(int roleNo, String name, String dept, Subject[] subjects){
        this.roleNo = roleNo;
        this.name = name;
        this.dept = dept;
        this.subjects = subjects;
    }

    public int getRoleNo() {
        return roleNo;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSubjects(Subject... subjects) {
        for (int i = 0; i < subjects.length; i++) {
            this.subjects[i] = subjects[i];
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "roleNo=" + roleNo +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}

class Subject{
    private int id;
    private String name;
    private int maxMark;
    private int markObtained;

    public Subject(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Subject(int id, String name, int maxMark){
        this.id = id;
        this.name = name;
        this.maxMark = maxMark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxMark() {
        return maxMark;
    }

    public int getMarkObtained() {
        return markObtained;
    }

    public void setMarkObtained(int markObtained) {
        this.markObtained = markObtained;
    }

    public void setMaxMark(int maxMark) {
        this.maxMark = maxMark;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxMark=" + maxMark +
                ", markObtained=" + markObtained +
                '}';
    }
}
