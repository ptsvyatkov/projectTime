package loops;

public class IsNumberPalindrome {
    static int reverse = 0;
    static int remain;

    private static void checkIfNumPalindrome(int num) {
        int temp = num;
        while (num > 0) {
            remain = num % 10;
            reverse = reverse * 10 + remain;
            num = num / 10;
        }
        System.out.println(reverse == temp);
    }

    public static void main(String[] args) {
        checkIfNumPalindrome(12321);
    }
}
