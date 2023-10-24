package org.example.all.Palindrome;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal, Panama"));  // true
        System.out.println(isPalindrome("racecar"));                           // true
        System.out.println(isPalindrome("hello"));                             // false
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Convert to lowercase and remove non-alphanumeric characters
        String cleaned = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Compare cleaned string with its reverse
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}
