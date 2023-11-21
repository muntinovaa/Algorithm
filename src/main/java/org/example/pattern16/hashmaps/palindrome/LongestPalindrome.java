package org.example.pattern16.hashmaps.palindrome;

import java.util.HashMap;
import java.util.Map;

/**
 Given a string s which consists of lowercase or uppercase letters,
 return the length of the longest palindrome that can be built with
 those letters.
 Letters are case sensitive,
 for example, "Aa" is not considered a palindrome here.

 Example 1: Input: s = "abccccdd"
 Output: 7
 Explanation: One longest palindrome that can be built is "dccaccd",
 whose length is 7.
 Example 2: Input: s = "a"
 Output: 1
 Explanation: The longest palindrome that can be built is "a",
 whose length is 1.
 **/
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("Test"));
    }
    public static int longestPalindrome(String s) {
        int oddCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) % 2 == 1)
                oddCount++;
            else
                oddCount--;
        }
        if (oddCount > 1)
            return s.length() - oddCount + 1;
        return s.length();
    }
}
