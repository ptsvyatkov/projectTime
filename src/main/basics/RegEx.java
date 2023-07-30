package basics;

public class RegEx {

    public static void main(String[] args) {

        /* Matching Symbols */
        String str1 = "f";
        str1.matches("."); // any single symbol -> true

        String str2 = "abc";
        str2.matches("."); // false

        str2.matches("[abc]"); // true -> only a,b,c allowed

        String str3 = "p";
        str3.matches("[^abc]"); // true for anything that's not a,b,c
        str3.matches("[a-z0-9]"); // matches anything from a to z or 0 to 9 -> true

        String str4 = "A";
        str4.matches("[a-zA-Z0-9]"); // Now includes capital letters from A to Z too -> true
        str4.matches("A|B"); // A or B -> true

        /* Meta characters */
        String str5 = "a";
        str5.matches("\\w"); // Any alphabet or digit -> true
        str5.matches("\\d"); // Any digit -> false

        String str6 = "$";
        str6.matches("\\W"); // Other than digits and alphabets -> true
        str6.matches("\\D"); // Not a digit -> true

        String str7 = " ";
        str7.matches("\\s"); // Matches space (empty space) -> true
        str7.matches("\\S"); // Not a space -> false
    }

}
