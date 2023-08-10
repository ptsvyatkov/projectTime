package StaticAndFinal;

//Not commonly used, but possible
public class StaticBlockDemo {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Main");     // Executed after block 1 and block 2
    }
}

class Test {
    static {
        System.out.println("Block 1");
    }
    static {
        System.out.println("Block 2");
    }
}