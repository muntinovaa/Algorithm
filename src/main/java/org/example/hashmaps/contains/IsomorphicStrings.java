package org.example.hashmaps.contains;

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
        System.out.println(isIsomorphic("eegg", "aadd")); // Output: true
     //   System.out.println(isIsomorphic("foo", "bar")); // Output: false
     //   System.out.println(isIsomorphic("paper", "title")); // Output: true

    }
     public static boolean isIsomorphic(String s1, String s2) {
       if (s1.length() != s2.length()) {
           return false;
       }
       Map<Character, Character> map1 = new HashMap<>();
       Map<Character, Character> map2 = new HashMap<>();

       for (int i = 0; i < s1.length(); i++) {
           char m1Char = s1.charAt(i);
           char m2Char = s2.charAt(i);

           // Check mapping from s to t
           if (!map1.containsKey(m1Char)) {
                map1.put(m1Char, m2Char);
                System.out.println(m1Char + " - " + m2Char); //e - a
           } else {
               if (map1.get(m1Char) != m2Char) {
                   return false;
               }
           }
           // Check mapping from t to s
           if (!map2.containsKey(m2Char)) {
               map2.put(m2Char, m1Char);
               System.out.println(m2Char + " - " + m1Char); //a - e
           } else {

               if (map2.get(m2Char) != m1Char) {
                   return false;
               }
           }
       }

       return true;
   }
}
