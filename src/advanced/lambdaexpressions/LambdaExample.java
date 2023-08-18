package lambdaexpressions;

@FunctionalInterface
interface MyLambda {
    // void display(String str);
    int add(int x, int y);
}

class MyLambdaTest implements MyLambda {
    @Override
    public int add(int x, int y) {
        return x+y;
    }
}

public class LambdaExample {
    public static void main(String[] args) {

        /*
        MyLambda mLong = new MyLambda() {
            public void display(String s) {
                System.out.println("Hello World");
            }
        };
        */

        /*
        // Parameter s will be automatically of String type
        MyLambda mShort = (s) -> System.out.println(s);
        // MyLambda mShort = System.out::println;
        mShort.display("Hello World");
        */

        // MyLambda ml = (a,b) -> { return a+b;};
        MyLambda ml = (a,b) -> a+b;
        int r = ml.add(20,30);
        System.out.println(r);
    }
}
