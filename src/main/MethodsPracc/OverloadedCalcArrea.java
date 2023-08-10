package MethodsPracc;

public class OverloadedCalcArrea {

    // area of circle, rectangular

    static int calcArea(int length, int width){
        return length*width;
    }

    static double calcArea(double radius) {
        return Math.PI*radius*radius;
    }

    static double calcArea(double a, double b, double height) {
        return 0.5*(a+b)*height;
    }

    public static void main(String[] args) {

    }

}
