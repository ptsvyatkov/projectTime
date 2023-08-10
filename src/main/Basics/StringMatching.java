package Basics;

public class StringMatching {

    private static String str = "programmer@gmail.com";

    private static void checkIfEmailFromGmail(){
        int index1 = str.indexOf("@");
        int index2 = str.indexOf(".");

        System.out.println(str.substring(index1+1, index2)); // +1, because we don't want the "@" symbol (index included, index excluded)

        /* second way */
        System.out.println(str.contains("gmail") ? "E-mail contains gmail" : "does not contain gmail");
    }

    private static void findUsernameAndDomain() {
        int indexEnd = str.indexOf("@");
        String username = str.substring(0,indexEnd);
        String domainName = str.substring(indexEnd+1, str.length());
        System.out.println(username +" "+ domainName);
    }

    private static void checkIfBinary() {
        int b = 1001010;
        String str = String.valueOf(b);
        System.out.println(str.matches("[0-1]+"));
    }

    private static void checkIfHexadecimal() {
        String str = "255ABC";
        System.out.println(str.matches("[0-9A-F]+"));
    }

    // Check if Date is in format of dd/mm/yyyy using regex (basic example)
    private static void checkDateFormat() {
        String date = "21/10/1999";
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }

    public static void main(String[] args) {
        String str1 = "abcdef";
        boolean example1 = str1.matches(".*"); // Any character is allowed 0 or more times -> true
        String str2 = "abc def"; // with space
        boolean example2 = str2.matches(".*"); // true

        String str3 = "abc6def";
        boolean example3 = str3.matches("[a-z]*"); // Any letter from a to z 0 or more times -> false (has digit)

        String str4 = "aBcdef";
        boolean example4 = str4.matches("[a-z]*"); // false -> str4 contains capital letter

        String str5 = "abcaaabbbccaab";
        boolean example5 = str5.matches("[abc]*"); // true -> a,b,c can appear 0 or more times

        String str6 = "";
        boolean example6 = str6.matches("[abc]*"); // true
        boolean example7 = str6.matches("[abc]+"); // false -> + requires that it appears at least once (1 or more)

        String str7 = "acc";
        boolean example8 = str7.matches("[abc]{3}"); // true -> a,b,c can occur, but the string has to be exactly 3 letters
        boolean example9 = str7.matches("[abc]{3,7}"); // true -> from 3 to 7 letters

        String str8 = "john@gmail.com";
        boolean matchGmail = str8.matches(".*gmail.*"); // anything any amount of times gmail anything any amount of times
        boolean matchGmail2 = str8.matches("\\w*gmail.*"); // alphabets and digits gmail anything

        checkIfEmailFromGmail();
        findUsernameAndDomain();

        checkIfBinary();
        checkIfHexadecimal();
        checkDateFormat();
    }
}
