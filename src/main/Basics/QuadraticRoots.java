package Basics;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a,b,c;
        double r1,r2;
        System.out.println("Enter a,b,c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double sqrt1 = Math.sqrt(b * b - 4 * a * c);
        r1=(-b+ sqrt1)/(2*a);
        r2=(-b- sqrt1)/(2*a);

        System.out.println("The roots of the quadratic expression are "+r1 +" and "+ r2);
    }
}
