package org.example.hashmaps.pairs;
//2062. Count Vowel Substrings of a String

import java.util.HashSet;
import java.util.Set;

/**
 A substring is a contiguous (non-empty) sequence of characters within a string.
 A vowel substring is a substring that only consists of vowels ('a', 'e', 'i', 'o', and 'u') and has all five vowels present in it.
 Given a string word, return the number of vowel substrings in word.

 Example 1: Input: word = "aeiouu"
 Output: 2
 Explanation: The vowel substrings of word are as follows (underlined):
 - "aeiouu"
 - "aeiouu"
 Example 2: Input: word = "unicornarihan"
 Output: 0
 Explanation: Not all 5 vowels are present, so there are no vowel substrings.
 **/
public class CountVowelSubstringsString {
    public static void main(String[] args) {
        System.out.println(countVowelSubstrings("aeiouu"));
    }
    public static int countVowelSubstrings(String word) {
        int res =0; // record the count of the Substring of Vowels

        Set<Character> set = new HashSet<>();
        for(int i=0; i<word.length(); i++){

            for(int j=i; j<word.length(); j++){
                char ch = word.charAt(j);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    set.add(ch);
                    if(set.size()==5) res++;
                } else{
                    break;
                }
            }
            set.clear();
        }

        return res;
    }
}
