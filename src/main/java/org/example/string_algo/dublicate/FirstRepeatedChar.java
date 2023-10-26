package org.example.string_algo.dublicate;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        System.out.println(firstRepChar(str1)); // Expected Output: e

        String str2 = "hellogeeks";
        System.out.println(firstRepChar(str2)); // Expected Output: l

        String str3 = "abc";
        System.out.println(firstRepChar(str3)); // Expected Output: -
    }
    public static char firstRepChar(String S) {
        int[] freq = new int[26]; // Assuming only lowercase letters

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (freq[ch - 'a'] > 0) {
                return ch;
            }
            freq[ch - 'a']++;
        }

        return '-'; // If no repeated character is found
    }


}
