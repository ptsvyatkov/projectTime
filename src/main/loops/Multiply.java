package loops;

public class Multiply {

    private static void multiplicationUpToTen(int num){

        for (int i = 0; i <= 10; i++){
            System.out.println(num*i);
        }

    }

    public static void main(String[] args) {
            multiplicationUpToTen(5);
    }
}
