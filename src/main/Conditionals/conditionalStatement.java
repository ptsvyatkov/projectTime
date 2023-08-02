package Conditionals;

public class conditionalStatement {
    static int a = 10, b = 15, c = 20;
    static float mark1 = 4f, mark2 = 4.5f, mark3 = 5.25f, mark4 = 6f, mark5 = 4.65f;


    private static void superBasicSwitchStatement(int day) {
        switch (day){
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            default: System.out.println("invalid input");
                     break;
        }
    }

    private static void checkIfLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("leap");
                } else {
                    System.out.println("not");
                }
            } else {
                System.out.println("leap");
            }
        } else {
            System.out.println("not");
        }
    }


    // for inputs between 0-7 it could be 8 or 10, that's fine
    private static void findRadixOfNumberGivenAsString(String number) {
        System.out.println(number);
        if (number.matches("[01]+")) {
            System.out.println("radix 2");
        } else if (number.matches("[0-7]+")) {
            System.out.println("radix 8");
        } else if (number.matches("[0-9A-F]+")) {
            System.out.println("radix 16");
        } else if (number.matches("[0-9]+")) {
            System.out.println("radix 10");
        } else {
            System.out.println("invalid number");
        }
    }

    private static void checkLargestOfThreeNumbers() {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    private static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else { //this else can be omitted
            System.out.println("Odd");
        }
    }

    private static void findAverageMark() {
        float averageMark = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;
        if (averageMark >= 5.5) {
            System.out.println("Excellent");
        } else if (averageMark >= 5 && averageMark < 5.5) {
            System.out.println("Very good");
        } else if (averageMark >= 4.5 && averageMark < 5) {
            System.out.println("Good");
        } else {
            System.out.println("Satisfactory");
        }
    }

    public static void main(String[] args) {
        //superBasicSwitchStatement(5);
        //checkIfLeapYear(1900);
        //findRadixOfNumberGivenAsString("A33B1");
        // checkLargestOfThreeNumbers();
        // oddOrEven(45);
        // findAverageMark();
    }

}
