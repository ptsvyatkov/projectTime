package lambdaexpressions;

interface MyLambda2 {
    void display();
}

class Demo {
    int temp = 10;
    public void method1(){
        MyLambda2 ml2 = () -> {
            System.out.println("Hi");
            System.out.println("Bye "+ (++temp));
        };
        ml2.display();
    }
}

class UseLambda {
    public void callLambda(MyLambda2 ml){
        ml.display();
    }
}

class Demo2 {
    public void method1(){
        UseLambda ul = new UseLambda();
        ul.callLambda(()-> System.out.println("Hello"));
    }
}



public class LambdaExpressionsCapture {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.method1();
    }
}
