package loops;


public class Fibonacci {

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ... each new term is obtained by adding the previous two terms
    static void fib (int term1, int term2, int rounds) {
        int next = term2;
        System.out.print(term1+" ");
        for (int i = 0; i<=rounds-2; i++){
            System.out.print(next+" ");
            next = term1 + term2;
            term1 = term2;
            term2 = next;
        }
    }
    // very slow and unoptimized way, because we calculate the same result for each branch the method splits into
    // to improve -> save alredy calculated n in a HashMap, use memoization
    // OR use tail recursion only 2 recursive calls per iteration
    //                                 F(n)
    //                                /    \
    //                           F(n-1)   F(n-2)
    //                        /   \     /      \
    //                  F(n-2) F(n-3) F(n-3)  F(n-4)
    //                      /    \
    //                 F(n-3) F(n-4)
    static int fibRecursion(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibRecursion(n-1) + fibRecursion(n-2);
        }
    }


    public static void main(String[] args) {
        // fib(8,13,10);
        //int result = fibRecursion(10);
        //System.out.println(result);
    }
}
