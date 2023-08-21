package iostreams;
import java.io.*;

public class RandomAccessExample {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("./src/advanced/iostreams/TestRAF.txt", "rw");
        System.out.println((char) rf.read());
        System.out.println((char) rf.read());
        System.out.println((char) rf.read());
        rf.write('d');                      // pointer moves to next after writing too
        System.out.println((char) rf.read());  // prints 5th letter (e)
        rf.skipBytes(3);                    // skips f g h
        System.out.println((char) rf.read());  // should print i
        rf.seek(3);                        // should go to index 3 and next print
        System.out.println((char) rf.read());  // prints d
        System.out.println(rf.getFilePointer());                    // now is on index 4
        rf.seek(rf.getFilePointer()+2);    // moving the pointer from current position 2 positions forward
//      rf.seek(rf.getFilePointer()-2);        //                                           2 positions backwards
        System.out.println((char) rf.read());
    }
}
