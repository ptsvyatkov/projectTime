package MethodsPracc;

import java.util.Arrays;
import java.util.Objects;

public class FindMaxValueInArray {
    
    int findMax (int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }

    public static void main(String[] args) {
        FindMaxValueInArray x = new FindMaxValueInArray();
        int[] arr1 = new int[]{501, 22, 311, 3, 44, 55, 101, 444, 1075, 4, 78};
        int result = x.findMax(arr1);
        System.out.println(result);

        int asd = Arrays.stream(arr1).reduce(0, Integer::max);
        System.out.println(asd);
    }
    
}
