package MethodsPracc;

public class PrimeNumber {

    static boolean isPrime(int num) {
        for (int i = 2; i < num/2; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(91));
    }
}
