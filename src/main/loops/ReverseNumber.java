package loops;

public class ReverseNumber {

    // given 237, return 732
    static int reverse = 0 ;
    static int remain;
    private static void findReversedNumber(int num) {
        while (num > 0){
            remain = num % 10;
            reverse = reverse*10+remain;
            num=num/10;
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        findReversedNumber(237);
    }
}
