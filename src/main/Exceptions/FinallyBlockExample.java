package Exceptions;

public class FinallyBlockExample {

    static void method1() throws Exception{
        try {
            throw new Exception();
        }
        finally {                                   // If we are sure that we are handling all possible exceptions,
                                                    // then there is no need for a "finally" block
            System.out.println("Final message.");
        }
    }

    public static void main(String[] args) throws Exception {
        method1();
    }
}
