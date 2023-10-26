package org.example.string_algo;

/** Implement a method to perform basic string compression using the counts of repeated characters. E.g.,
 *  the string "aabcccccaaa" would become "a2b1c5a3".*/
public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa")); // Should print: a2b1c5a3
        System.out.println(compress("abcd"));       // Should print: abcd
    }
    public static String compress(String str) {
        // Corner case
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char currentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        // Add the last character and its count
        compressed.append(currentChar).append(count);

        // If compressed string is not shorter, return original string
        return compressed.length() < str.length() ? compressed.toString() : str;
    }


}
