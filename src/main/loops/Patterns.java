package loops;

public class Patterns {

    // 6 rows, 6 columns
    static void displayStarsAscLeftAligned(){
        for (int i = 0; i<=5; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // 5 rows, 5 columns
    static void displayStarsDescLeftAligned(){
        for (int i = 0; i<=5; i++){
            for (int j = 5; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1() {
        for (int i = 0; i<=5; i++){
            for (int j = 0; j <=5; j++) {
                System.out.print(j+" | ");
            }
            System.out.println("row" + i);
        }
    }

    static void pattern2() {
        for (int i = 1; i<=5; i++){
            for (int j = 1; j <=5; j++) {
                System.out.print(j+i+" | ");
            }
            System.out.println();
        }
    }

    static void pattern3() {
        int count = 0;
        for (int i = 1; i<=5; i++){
            for (int j = 1; j <=5; j++) {
                System.out.format("%02d ",++count);
            }
            System.out.println();
        }
    }

    static void pattern4(){
        int count = 0;
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=i; j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(){
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=5-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern6(){
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=5; j++){
                if (i<=j) {
                    System.out.print(("* "));
                } else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }

    static void pattern7(){
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=5; j++){
                if (i+j>5) {
                    System.out.print(("* "));
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern8(){
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=5 ; j++) {
                if (i+j>5) {
                    System.out.print(("* "));
                } else
                    System.out.print("  ");
            }
            for (int k = 0; k < 5; k++) {
                if (k<i) {
                    System.out.print("");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void drawTreeWithStars(){
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=5 ; j++) {
                if (i+j>5) {
                    System.out.print(("* "));
                } else
                    System.out.print("  ");
            }
            for (int k = 1; k < 5; k++) {
                if (k<i) {
                    System.out.print("* ");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //displayStarsAscLeftAligned();
        //displayStarsDescLeftAligned();
        //pattern3();
        drawTreeWithStars();
    }

}
