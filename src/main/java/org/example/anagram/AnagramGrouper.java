package org.example.anagram;

import java.util.*;

public class AnagramGrouper {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert string to character array and sort it to form a key for anagrams
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Add the original string to the corresponding list in the map
            map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ant", "bat", "tab", "atb"};
        System.out.println(groupAnagrams(words));
        // Expected output: [["eat", "tea"], ["tan", "ant"], ["bat", "tab", "atb"]]
        // Note: The order of groups or words inside groups might vary.
    }
}
