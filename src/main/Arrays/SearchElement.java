package Arrays;

public class SearchElement {
    //given array with no duplicates (can also add them to a Set), find given element
    static int[] arr = {3,9,7,8,12,6,15,5,4,10};

    // Linear Search O(N)
    static void findElement(int num){
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println(num+" is found at index "+i);
                System.exit(0);
            }
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        findElement(20);
    }

}
