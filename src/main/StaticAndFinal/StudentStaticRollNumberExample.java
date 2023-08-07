package StaticAndFinal;

import java.time.Year;

// At the creation of a Student object, the first roll number is assigned as "Univ_2023_1",
// then the next one should automatically be "Univ_2023_2" (counter)
class Student {
    private String rollNumber;
    private static int counter = 1;

    private String generateRollNumber() {
        String rollno = "Univ_"+ Year.now().getValue()+"_"+counter;
        counter++;
        return rollno;
    }

    public Student() {
        rollNumber = generateRollNumber();
    }

    public String getRollNumber() {
        return rollNumber;
    }
}


public class StudentStaticRollNumberExample {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        for (int i = 0; i< student.length;i++){
            student[i] = new Student();
        }
        for (Student s : student) {
            System.out.println(s.getRollNumber());
        }
    }
}
