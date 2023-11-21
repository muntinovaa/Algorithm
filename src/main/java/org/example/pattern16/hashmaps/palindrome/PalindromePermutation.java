package org.example.pattern16.hashmaps.palindrome;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
    public static void main(String[] args) {
       //System.out.println(canFormPalindrome("code"));   // Output: false
        System.out.println(canFormPalindrome("aab"));    // Output: true
       // System.out.println(canFormPalindrome("carerac")); // Output: true
    }
    public static boolean canFormPalindrome(String s) {
        Map<Character, Integer> charCounts = new HashMap<>();
        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        //a:2 b:1
        int oddCount = 0;
        for (int count : charCounts.values()) {
        // System.out.println(count);
            if (count % 2 != 0) {
                System.out.println(count % 2 );
                oddCount++;
            }
            if (oddCount > 1) {
                return false;
            }
        }
        // System.out.println(oddCount);
        return true;
    }
}
