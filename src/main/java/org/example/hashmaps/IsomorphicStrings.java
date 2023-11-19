package org.example.hashmaps;

import java.util.HashMap;
import java.util.Map;

/**
 Given two strings s and t, determine if they are isomorphic.
 Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 Example 1: Input: s = "egg", t = "add"
 Output: true
 Example 2: Input: s = "foo", t = "bar"
 Output: false
 Example 3: Input: s = "paper", t = "title"
 Output: true
 * */
public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); // Output: true
        System.out.println(isIsomorphic("foo", "bar")); // Output: false
        System.out.println(isIsomorphic("paper", "title")); // Output: true

    }
     public static boolean isIsomorphic(String s, String t) {
       if (s.length() != t.length()) {
           return false;
       }

       Map<Character, Character> sToT = new HashMap<>();
       Map<Character, Character> tToS = new HashMap<>();

       for (int i = 0; i < s.length(); i++) {
           char sChar = s.charAt(i);
           char tChar = t.charAt(i);

           // Check mapping from s to t
           if (sToT.containsKey(sChar)) {
               if (sToT.get(sChar) != tChar) {
                   return false;
               }
           } else {
               sToT.put(sChar, tChar);
           }

           // Check mapping from t to s
           if (tToS.containsKey(tChar)) {
               if (tToS.get(tChar) != sChar) {
                   return false;
               }
           } else {
               tToS.put(tChar, sChar);
           }
       }

       return true;
   }
}
