package org.example.hashmaps.contains;

import java.util.HashMap;
import java.util.Map;

public class WordsContainedCheck {
    public static void main(String[] args) {
        String word1 = "Bacardi JD corona budwiser";
        String word2 = "Bacardi malboro JD heinekin budwiser JD fireball corona bacardi corona budwiser";

        boolean result = areWordsContained(word1, word2);
        System.out.println(result); // Should print true
    }
    public static boolean areWordsContained(String word1, String word2) {
        // Tokenize the input strings into arrays of words
        String[] words1 = word1.split(" ");
        String[] words2 = word2.split(" ");

        // Create frequency maps for both word1 and word2
        Map<String, Integer> word1Map = new HashMap<>();
        Map<String, Integer> word2Map = new HashMap<>();

        // Populate the frequency map for word1
        for (String word : words1) {
            word1Map.put(word, word1Map.getOrDefault(word, 0) + 1);
        }

        // Populate the frequency map for word2
        for (String word : words2) {
            word2Map.put(word, word2Map.getOrDefault(word, 0) + 1);
        }

        // Check if every word in word1 is present in word2 with counts
        for (String word : words1) {
            if (!word2Map.containsKey(word) || word2Map.get(word) < word1Map.get(word)) {
                return false;
            }
        }

        return true;
    }


}
