package Loops;

public class DisplaySeries {

    // Arithmetic progression series
    // Given input 5, common difference 5 and wanted amount of numbers 10 -> display 5, 10, 15, 20, 25....
    static void displayAPSeries(int input, int commonDiff, int rounds) {
        int term = input;
        for (int i = 0; i<rounds; i++){
            System.out.print(term+",");
            term = term + commonDiff;
        }
    }

    // Geometric progression in the form of -> a+a*r+a*(r^2)+a*(r^3).....
    // Given input and ratio and desired amount of rounds to run, display the GP of a number
    // E.g: for input 5, ratio 2, rounds 5 -> 5, 5*2, 10*2, 20*2, 40*2
    static void displayGPSeries(int input, int ratio, int rounds){
        int term = input;
        for (int i = 0; i < rounds; i++){
            System.out.print(term+",");
            term = term*ratio;
        }
    }

    public static void main(String[] args) {
        displayAPSeries(5, 5, 10);
        System.out.println();
        displayGPSeries(5,2,5);
    }
}
