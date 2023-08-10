package MethodsPracc;

public class OverloadReverseIntArray {

    static int reverse(int n){
        return n;
    }

    static int[] reverse(int n[]){
        int[] arr2 = new int[n.length];
        // .... traverse n from the end and copy values to arr2, by using a helper variable
        for (int i = n.length-1, j = 0; i >=0 ; i--, j++) {
            arr2[j]=n[i];
        }
        return arr2;
    }

}
