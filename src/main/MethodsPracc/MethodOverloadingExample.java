package MethodsPracc;

public class MethodOverloadingExample {

    static int max(int x, int y){
        return x > y ? x : y;
    }

    static byte max(byte x, byte y){
        return x > y ? x : y;
    }

    static float max(float x, float y) {
        return x>y ? x : y;
    }

    public static void main(String[] args) {
        max(5,10);
        max(5.1f, 12.5f);
    }

}
