package Arrays;

import java.util.Arrays;

public class SortArrayOfStrings {

    static String arr[] = {"java","python","pascal","smalltalk","ada","basic"};

    static void sortStrings() {
        Arrays.sort(arr);
        for (String x: arr) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        sortStrings();
    }
}
