package Loops;

public class CountDigits {
    static int count;
    private static void countNumOfDigits(int num){
        while (num > 0) {
            num/=10;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        countNumOfDigits(44051);
    }
}
