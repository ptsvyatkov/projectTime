package Basics;

public class SwappingAndMasking {

    private static void swapNumbersUsingXOR(int a, int b) {
        System.out.println("Before swapping, A is "+a+" and B is "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping, A is "+a+" and B is "+b);
    }

    private static void storeTwoNumbersInVariable(byte a, byte b){
        // Store a and b inside c
        // HINT: in order to store both 9 and 12, only 4 bits are required
        byte c;
        c = (byte) (a<<4);
        c = (byte) (c | b);

        // Bitwise masking the first 4 bits of c and then moving those to the right-hand side (last 4 bits)
        System.out.println("The first number is "  +((c&0b11110000)>>4));

        // No need to bitshift them as they are already on the right-hand side (least significant bit side)
        System.out.println("The second number is " +(c&0b00001111));
    }

    public static void main(String[] args) {
        swapNumbersUsingXOR(10, 15);
        storeTwoNumbersInVariable((byte) 2,(byte) 4);
    }
}
