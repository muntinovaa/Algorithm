package org.example.all.Palindrome;

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

    public boolean isPalindrome1(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }



}
