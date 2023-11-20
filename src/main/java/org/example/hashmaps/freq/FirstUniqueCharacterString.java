package org.example.hashmaps.freq;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        String str = "leetcode";
        Character char1 = firstUniqueChar(str);
        Character char2 = firstUniqueChar1(str);
        System.out.println(char1);
        System.out.println(char2);

    }

    public static Character firstUniqueChar(String str){
        HashMap<Character,Integer> charCount = new HashMap<>();

        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            charCount.put(c,1 + charCount.getOrDefault(c,0));
        }

        for (int i=0; i<str.length(); i++){
            if (charCount.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }

      return null;
    }

    public static Character firstUniqueChar1(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return null; // Return null if no unique character is found
    }
}
