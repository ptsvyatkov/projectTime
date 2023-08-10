package Arrays;

public class FindMaxElement {
    static int[] arr = {3,9,7,8,12,6,15,5,4,10};
    static int[] arr2 = {3,9,7,8,12,6,15,5,4,100};

    // Given array arr, find the largest number
    static void findMax(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    // Given array arr, find the second-largest number
    static void findSecondMax(int[] array){
        int max1,max2;
        max1 = max2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            } else if (array[i] > max2){
                max2 = array[i];
            }
        }
        System.out.println(max2);
    }

    public static void main(String[] args) {
        findMax(arr);
        findSecondMax(arr2);
    }
}
