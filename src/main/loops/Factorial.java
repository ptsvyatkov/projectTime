package loops;

public class Factorial {

    private static void findFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++){
            result = result * i;
        }
        System.out.println(result);
    }

    public static long factRecursion(int num)
    {
        if (num <= 1) {
            return 1;
        }
        else
            return num * factRecursion(num - 1);
    }

    public static void main(String[] args) {
        //findFactorial(5);
        long fact = factRecursion(5);
        System.out.println(fact);
    }

}
