package Arrays;

import java.util.Arrays;

public class SumOfAllElements {

    static int[] arr = {3,9,7,8,12,6,15,5,4,10};
    static void findSum() {
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
            Arrays.stream(arr).average();
        }
        System.out.println(sum);
    }

    static void findSum2() {
        int sum = 0;
        for(int el : arr){
            sum = sum + el;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        findSum();
        findSum2();
    }
}
