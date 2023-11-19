package org.example.hashmaps;

import java.util.HashMap;
import java.util.Map;

/**
 Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 Each letter in magazine can only be used once in ransomNote.
 Example 1: Input: ransomNote = "a", magazine = "b"
 Output: false
 Example 2:
 Input: ransomNote = "aa", magazine = "ab"
 Output: false
 Example 3:
 Input: ransomNote = "aa", magazine = "aab"
 Output: true
 * */
public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b")); // Output: false
        System.out.println(canConstruct("aa", "ab")); // Output: false
        System.out.println(canConstruct("aa", "aab")); // Output: true
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> letterCounts = new HashMap<>();

        // Count the frequency of each letter in magazine
        for (char c : magazine.toCharArray()) {
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
        }

        // Check if each letter in ransomNote can be constructed from magazine
        for (char c : ransomNote.toCharArray()) {
            if (!letterCounts.containsKey(c) || letterCounts.get(c) <= 0) {
                return false;
            }
            letterCounts.put(c, letterCounts.get(c) - 1);
        }

        return true;
    }


}
