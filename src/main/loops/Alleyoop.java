package loops;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Alleyoop {
    private static int startValue = 0;
    private static int endCondition = 100;

    private static void checkForLoop(){
        for(; startValue < endCondition ; startValue++) {  // optional initialization part

        }
        System.out.println(startValue);
    }

    private static void checkForEachLoop() {
        int arrLength = 10;
        int[] arr = IntStream.range(0,arrLength).toArray();
        // or
        int[] arr2 = new int[arrLength];
        IntStream.range(0, arrLength).forEach(i -> arr2[i] = i++);

        // System.out.println(Arrays.toString(arr2));

        for (int element : arr){
            // System.out.println(element);
        }

        for (int element2 : arr2) {
            // System.out.println(element2);
        }
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        for (int el : list) {
             System.out.println(el);
        }

    }

    private static void checkWhileLoop(){
        while(startValue < endCondition) {
            startValue++;
        }
        System.out.println(startValue);
    }

    private static void checkDoWhileLoop(){
        do{
          startValue++;
        } while (startValue < endCondition);
        System.out.println(startValue);
    }

    public static void main(String[] args) {
        // checkWhileLoop();
        // checkDoWhileLoop();
        // checkForLoop();
        // checkForEachLoop();
    }

}
