package org.example.Anagrams;

import java.util.*;
/*
public class GroupAnagrams {
    public static Map<String, List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : strs) {
            // Sort characters of the word to form the key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Put the word in the corresponding group
            if (!anagramGroups.containsKey(sortedWord)) {
                anagramGroups.put(sortedWord, new HashMap<>);
            }
            anagramGroups.get(sortedWord).add(word);
        }

        return anagramGroups;
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ant", "bat", "tab", "cat"};
        Map<String, List<String>> anagramGroups = groupAnagrams(words);

        for (List<String> group : anagramGroups.values()) {
            System.out.println(group);
        }
    }
}
*/