package Loops;

public class sumOfNNumbers {

    private static void findSumOfNNumbers(int n){
        int result = 0;

        for (int i = 0; i <= n; i++){
            result = result + i;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        findSumOfNNumbers(10);
    }
}
