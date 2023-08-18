package lambdaexpressions;

interface MethodReference {
    //void display(String str);
    int display(String str, String str2);
}

public class MethodReferenceExample {

    public MethodReferenceExample(String s){
        System.out.println(s.toUpperCase());
    }

    void reverse(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        // MethodReference mr = System.out::println;
        // MethodReferenceExample mre = new MethodReferenceExample();  // for non-static methods we need to create an object
        // MethodReference mr = mre::reverse;                          // and assign it to the lambda expression
        // mr.display("Hello");

        // MethodReference mr = MethodReferenceExample::new; // now it is referring to the constructor

        MethodReference mr2 = String::compareTo;
        System.out.println(mr2.display("Hello", "Hello"));
    }
}
