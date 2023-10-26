package org.example.string_algo;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal, Panama!"));  // true
        System.out.println(isPalindrome("racecar"));  // true
        System.out.println(isPalindrome("hello"));    // false
    }

    public static boolean isPalindrome(String str) {
        // Step 1: Convert to lowercase
        str = str.toLowerCase();

        // Step 2: Remove non-alphanumeric characters
        StringBuilder alphanumericString = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                alphanumericString.append(c);
            }
        }
        String cleanedStr = alphanumericString.toString();

        // Step 3: Check for palindrome property
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }


}
