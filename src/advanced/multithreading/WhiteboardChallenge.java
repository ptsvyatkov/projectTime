package multithreading;

// Whiteboard, Teacher and Students are present. The teacher writes something on the whiteboard and until all
// Students have read and copied all the text, nothing new should be written. Whiteboard knows how many students there are.

class Whiteboard {
    String text;
    int numStudents = 0;
    int count = 0;
    public void attendance() {
        numStudents++;
    }

    synchronized public void write(String str){
        System.out.println("Teacher is writing... " + str);
        while (count!=0){
            try {wait();} catch (Exception e){}
        }
        text = str;
        count = numStudents;
        notifyAll();
    }

    synchronized public String read() {
        while (count==0){try {wait();} catch (Exception e){}
        }
        String str = text;
        count--;
        if (count==0)
            notify();
        return str;
    }
}

class Teacher extends Thread {
    Whiteboard wb;
    String notes[] = {"Message 1","Message 2","Message 3","Message 4","end"};
    public Teacher(Whiteboard wb) {
        this.wb = wb;
    }

    @Override
    public void run() {
        for (int i = 0; i < notes.length; i++) {
            wb.write(notes[i]);
        }
    }
}

class Student extends Thread {
    Whiteboard wb;
    String name;
    public Student(String name,Whiteboard wb) {
        this.name = name;
        this.wb = wb;
    }

    @Override
    public void run() {
        String text;
        wb.attendance();
        do {
            text = wb.read();
            System.out.println(name + " is reading " + text);
            System.out.flush();
        } while (!text.equals("end"));
    }
}

public class WhiteboardChallenge {
    public static void main(String[] args) {
        Whiteboard wb = new Whiteboard();
        Teacher t = new Teacher(wb);
        Student st1 = new Student("1. John",wb);
        Student st2 = new Student("2. Chuck", wb);
        Student st3 = new Student("3. Bale", wb);
        t.start();
        st1.start();
        st2.start();
        st3.start();
    }
}
