package Loops;

public class ArmstrongNumber {

    // given 153, take each digit and cube it separately, 1^3 + 5^3 + 3^3, if the sum is same as the number -> armstrong number

    static int remain;
    static int sum;

    private static void findArmstrong(int num) {
        int m = num;

        while (num > 0) {
            remain = num % 10;
            sum = sum+remain*remain*remain;
            num = num / 10;
        }
        if (m == sum) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not armstrong");
        }
    }

    public static void main(String[] args) {
        findArmstrong(153);
    }

}
