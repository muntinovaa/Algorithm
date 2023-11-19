package org.example.hashmaps.freq;

import java.util.HashMap;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        String str = "leetcode";
        int index = firstUniqueChar(str);
        if (index != -1) {
            System.out.println("First unique character is at index: " + index);
            System.out.println(str.charAt(index));
        } else {
            System.out.println("No unique character found.");
        }
    }

    public static Integer firstUniqueChar(String str){
        HashMap<Character,Integer> charCount = new HashMap<>();

        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            charCount.put(c,1 + charCount.getOrDefault(c,0));
        }

        for (int i=0; i<str.length(); i++){
            if (charCount.get(str.charAt(i)) == 1) {
                return i;
            }
        }

      return -1;
    }
}
