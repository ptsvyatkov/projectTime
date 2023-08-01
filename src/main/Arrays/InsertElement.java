package Arrays;

import java.util.Arrays;

public class InsertElement {
    static int[] arr = new int[10];

    // Given array arr and num of elements 6, insert any given num to index 2, while preserving the following numbers in the array
    static void insertIntoArray(int[] arr, int numElements, int numToInsert, int index) {
        for (int i = numElements; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = numToInsert;
        printArray(arr);
    }


    public static void main(String[] args) {
        // elements that are not zero can be found by looping and having a count++ var if the a[i] is not 0
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 6;
        arr[3] = 10;
        arr[4] = 12;
        arr[5] = 7;
        System.out.println("Before insertion");
        printArray(arr);
        System.out.println("After insertion");
        insertIntoArray(arr, 6, 77, 9);
    }

    static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }
}
