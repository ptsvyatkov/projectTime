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

    static void deleteAnElementCommented(int[] array, int numElements, int indexToDelete) {
        // {1,2,3,4,5,6,0,0,0,0} array of size 10
        // 6 non-null elements
        // we want to delete a specific INDEX, not a specific number (here we delete index 1)

        for (int i = indexToDelete+1; i <= numElements; i++) {
            // start at the next index to the one to be deleted
            // iterate until the last non-null element and including it (<=)
            // set the value of the right element to the previous index

            array[i-1] = array[i];
            // original array {1,2,3,4,5,6,0,0,0,0} -> everytime value to the right is copied in the previous index,
            // starting at index indexToDelete+1 and iterating numElements-1 times

            // after first iteration:  {1,3,3,4,5,6,0,0,0,0}  -> where i is 2
            // after second iteration: {1,3,4,4,5,6,0,0,0,0}  -> where i is 3
            // after third iteration:  {1,3,4,5,5,6,0,0,0,0}  -> where i is 4
            // after fourth iteration: {1,3,4,5,6,6,0,0,0,0}  -> where i is 5
            // after fifth iteration:  {1,3,4,5,6,0,0,0,0,0}  -> where i is 6
        }
        printArray(arr);
    }

}
