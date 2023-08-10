package MethodsPracc;

public class OverloadValidation {

    static boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+"); // small, capital letters or space
    }

    static boolean validate(int age) {
        return age >=3 && age <= 15;
    }

    public static void main(String[] args) {

    }

}
