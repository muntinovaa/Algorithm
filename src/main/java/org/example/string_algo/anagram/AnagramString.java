package org.example.string_algo.anagram;

public class AnagramString {

    public static void main(String[] args) {
     //   System.out.println(areAnagrams("listen", "silent")); // true
        System.out.println(areAnagrams("helllo", "helllo"));   // false
    }

    private static final int CHAR_SET_SIZE = 128; // Assuming ASCII character set

    public static boolean areAnagrams(String str1, String str2) {
        // If lengths are not equal, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[CHAR_SET_SIZE];

        // Increment count for chars in str1
        for (char c : str1.toCharArray()) {
            charCount[c]++;
            System.out.println("inc 1: " + charCount[c]);
        }

        // Decrement count for chars in str2
        for (char c : str2.toCharArray()) {
            charCount[c]--;
            System.out.println("dec 2: " +charCount[c]);
            if (charCount[c] < 0) {
                return false;
            }
        }

        return true;
    }


}
