package Arrays;

import static Arrays.InsertElement.printArray;

public class DeleteElement {
    static int[] arr = new int[10];

    static void deleteAnElement(int[] array, int numElements, int indexToDelete) {
        for (int i = indexToDelete+1; i <= numElements; i++) {
            array[i-1] = array[i];
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 6;
        arr[3] = 10;
        arr[4] = 12;
        arr[5] = 7;
        printArray(arr);
        deleteAnElement(arr, 6, 1);
    }
}
