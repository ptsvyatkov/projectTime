package Arrays;

import java.util.Arrays;

public class RotateArray {
    static int[] arr = {3,9,7,8,12,6,15,5,4,10};

    // given the above array, shift the numbers with 1 to the left with a wrap -> that is the 3 should become the last number

    static void leftRotation(int[] array) {
        int temp = array[0];
        for (int i = 1; i < arr.length; i++) {  // NOTE: if we initialize i as 0 (int i = 0) and condition is i < arr.length-1
            array[i-1] = array[i];              // then we can also write array[i] = array[i+1]
        }                                       // Result is the same -> save the number to the right at the previous index
        array[array.length-1] = temp;
        System.out.println(Arrays.toString(array));
    }

    static void rightRotation(int[] array) {
        int temp = array[array.length-1];
        for (int i = array.length-1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = temp;
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        System.out.println("Normal array");
        System.out.println(Arrays.toString(arr));
//        System.out.println("Left rotate");
//        leftRotation(arr);
        System.out.println("Right rotate");
        rightRotation(arr);
    }
}
