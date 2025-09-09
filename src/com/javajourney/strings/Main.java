package com.javajourney.strings;

public class Main {
    public static void main(String[] args) {
        String str = "Jayesh Sanjay Hiwarkar";
        String s2 = "This is String 2";

        //📌📌 Conversion
        //String.valueOf(123)              // int → String
        //Integer.parseInt("123")         // String → int

        str.length();       // length of string
        str.charAt(2);    // character at index i
        str.toCharArray();  // convert to char array.


        //📌Comparisons
        str.equals(s2);          // true if contents same
        str.equalsIgnoreCase(s2);// case-insensitive compare
        str.compareTo(s2);     // dictionary order (-/0/+)
        str.contains("abc");      // substring check


        //📌Substring & Parts
        str.substring(2);       // from index 2 till end
        str.substring(2, 5);     // from index 2 to 4
        str.replace("a", "aa");


        //📌Search
        str.indexOf("a");        // first index of "a" (else -1)
        str.lastIndexOf("a") ;   // last index


        String[] s1arr = str.split(" ");
        /*📌
         → Splits the string based on the given regex (pattern/delimiter)
         Todne ka base hota hai delimiter (yaani jis symbol/regex ke basis pe cut karna hai).
            → Returns an array of substrings
         */


        str.compareTo(s2);
        /*📌
        Returns: int
                     0 →   str == s2 (equal strings)
                    < 0 →   str is smaller (lexicographically smaller)
                    > 0 →   str is larger (lexicographically larger)

    How value is calculated:
        - Finds first different char
        - Returns (str.charAt(i) - s2.charAt(i))
        - That’s why you may see -10, +5, etc.
         */


    }
}
