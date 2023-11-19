package org.example.hashmaps.anagram;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings s and t,
return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging
the letters of a different word or phrase, typically
using all the original letters exactly once.
Example 1:Input: s = "anagram", t = "nagaram"
Output: true
Example 2:Input: s = "rat", t = "car"
Output: false

 */
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("tokash1","tokash1"));
    }
    public static boolean isAnagram(String s1, String s2){
        Map<Character,Integer> count = new HashMap<>();

        for (Character c : s1.toCharArray()){
            count.put(c,count.getOrDefault(c,0) + 1);
        }
        for (Character c1 : s2.toCharArray()){
            count.put(c1,count.getOrDefault(c1,0) -1);
        }
        for (Integer value: count.values()){
            if (value != 0){
                return false;
            }
        }
        return true;
    }
}
