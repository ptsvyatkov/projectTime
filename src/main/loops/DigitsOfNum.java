package loops;

public class DigitsOfNum {

    // Given 257 return 7 5 2
    private static void digitsNum(int num){
        int remain;
        while (num > 0) {
            remain = num % 10;
            num/=10;
            System.out.println(remain);
        }
    }

    public static void main(String[] args) {
        digitsNum(257);
    }
}
