package org.example.Anagrams;

public class AnagramChecker {
    public static void main(String[] args) {
        System.out.println(areAnagrams("Listen", "Silent"));  // true
        System.out.println(areAnagrams("Hello", "World"));    // false
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Convert to char array and sort
        char[] chars1 = str1.toLowerCase().toCharArray();
        java.util.Arrays.sort(chars1);

        char[] chars2 = str2.toLowerCase().toCharArray();
        java.util.Arrays.sort(chars2);

        // Return comparison result
        return java.util.Arrays.equals(chars1, chars2);
    }
}
