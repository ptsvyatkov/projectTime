package Arrays;

import java.util.Arrays;

public class ArrayCopy {
    static int[] arr = {1,2,3,4,5};
    static int[] arr2 = new int[arr.length];

    static void copyArrayAToB() {
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }

    static void reverseCopyArrayAToB() {
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            arr2[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr2));
    }

    static void increaseSizeOfArray(int[] array) {
        int[] newArray = new int[2*arr.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        newArray = null;
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        //copyArrayAToB();
        //reverseCopyArrayAToB();
        increaseSizeOfArray(arr);
    }
}
