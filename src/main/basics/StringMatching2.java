package basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringMatching2 {

    public static void main(String[] args) {

        String str = "a!B@c#1$2%3^";

        // Remove special characters from a String (allowed: a-z, A-Z, 0-9)
        String aBc123 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(aBc123);

        // Remove extra spaces from strings (also inbetween words)
        String sentence = "   This          string contains      multiple    whitespaces   between     words      ";
        String noWhitespace = sentence.replaceAll("\\s+", " ").trim();
        System.out.println(noWhitespace);

        // Find number of words in a String
        String[] words = noWhitespace.split("\\s"); // split words on each space
        // System.out.println(Arrays.toString(words));  // to print out what the String array contains

        System.out.println(words.length); // since words is an array of strings, we can check how many words using the .length

        List words2 = Arrays.stream(words).toList(); // alternatively, turn the word array into a stream and return as list to check size
        System.out.println(words2.size());

//         Print what the String array contains with lambda function
//         Stream.of(words).forEach(x -> System.out.println(x));
//           or
//         using the :: method reference
//         Stream.of(words).forEach(System.out::println);

    }

}
