package org.example.all.Palindrome;

public class PalindromeCount {
    public static int countPossiblePalindromes(String str) {
        int n = str.length();
        int count = 0;

        // Loop through all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "ababa";
        int palindromeCount = countPossiblePalindromes(input);
        System.out.println("Number of possible palindromes: " + palindromeCount);
    }
}
