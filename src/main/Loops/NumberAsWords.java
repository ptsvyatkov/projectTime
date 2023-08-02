package Loops;

public class NumberAsWords {

    private static int remainder;
    private static String str = "";

    // Display a number with words even when it contains trailing zero (e.g 24800)
    // Given 256, display two five six
    private static void displayNumAsWords(int num) {
        while(num > 0){
            remainder = num % 10;
            num = num / 10;
            str = str+remainder;
        }
        char c;
        for (int i = str.length()-1; i >=0; i--) {
            c = str.charAt(i);
            switch (c) {
                case '0': System.out.print("Zero "); break;
                case '1': System.out.print("One "); break;
                case '2': System.out.print("Two "); break;
                case '3': System.out.print("Three "); break;
                case '4': System.out.print("Four "); break;
                case '5': System.out.print("Five "); break;
                case '6': System.out.print("Six "); break;
                case '7': System.out.print("Seven "); break;
                case '8': System.out.print("Eight "); break;
                case '9': System.out.print("Nine "); break;
            }
        }

    }

    public static void main(String[] args) {
        // displayNumAsWords(155);
        displayNumAsWords(1074800);
    }

}
