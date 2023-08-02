package MethodsPracc;

public class FindGCD {

    int findHighestFactorOfTwoNums(int n1, int n2){
        int gcd = 0;
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            }
            else {
                n2 = n2 - n1;
            }
            gcd = n1;
        }
        return gcd;
    }

    public static void main(String[] args) {
        FindGCD findGCD = new FindGCD();
        System.out.println(findGCD.findHighestFactorOfTwoNums(35,56));
    }
}
