package Exceptions;

import java.io.FileInputStream;

public class TryWithResourcesExample {

    static void toDivide() throws Exception {
        try(FileInputStream fs = new FileInputStream("name of file");) {
            // do something
            // print something
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            toDivide();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
