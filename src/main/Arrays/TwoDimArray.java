package Arrays;

public class TwoDimArray {
    static int a[][] = new int[5][5]; // 3 rows and 4 cols
    static int b[][] = {{1,2,3},{2,4,6},{1,3,5}}; // 3x3 2d array

    static void print2DArray(){
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
    }

    static void printJaggedArray(){
        int[][] arr1;
        arr1 = new int[3][];
        arr1[0] = new int[5];
        arr1[1] = new int[3];
        arr1[2] = new int[8];
        arr1[0][4] = 5;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // print2DArray();
        printJaggedArray();
    }
}
