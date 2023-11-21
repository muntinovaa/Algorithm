package org.example.pattern16.hashset;

import java.util.HashSet;

/**
 Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.

 Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

 For example, swapping at indices 0 and 2 in "abcd" results in "cbad".


 Example 1:

 Input: s = "ab", goal = "ba"
 Output: true
 Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
 Example 2:

 Input: s = "ab", goal = "ab"
 Output: false
 Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
 Example 3:

 Input: s = "aa", goal = "aa"
 Output: true
 Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.

 * */
public class BuddyStrings {
    public static void main(String[] args) {
        System.out.println(buddyStrings("aa","aa"));
    }
    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            HashSet<Character> set = new HashSet<>();
            for (char c: s.toCharArray()) {
                if (!set.add(c)) {
                    return true;
                }
            }
            return false;
        }

        int dif = 0;
        Character swapS = null;
        Character swapG = null;
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char gChar = goal.charAt(i);
            if (sChar != gChar) {
                if (dif == 2 || (dif == 1 && (swapS != gChar || swapG != sChar))) {
                    return false;
                }
                swapS = sChar;
                swapG = gChar;
                dif++;
            }
        }
        return dif == 2;
    }
}
