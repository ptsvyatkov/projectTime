package Arrays;

public class MatrixMultiplication {
    static int a[][] = new int[3][3];
    static int b[][] = { {1,0,0}, {0,1,0} , {0,0,1} }; // identity matrix
    static int c[][] = new int[3][3];

    // Given int arrays a and b, with integer values in them, add them into array c
    static void addMatrix(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

    // multiply elements of arrayA row by elements of arrayB column
    static void multiplyMatrix() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                for (int k = 0; k < 3; k++) {
                    c[i][j] +=   a[i][k]*b[k][j];

                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void fillMatrix(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = 3;
            }
        }
    }

    public static void main(String[] args) {
        fillMatrix();
       // addMatrix();
        multiplyMatrix();
    }
}
