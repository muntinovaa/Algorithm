package org.example.StringAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedWord {
    public static void main(String[] args) {
        String sentence = "The quick brown fox and the quick dog";
        String nonRepeatedWord = findFirstNonRepeatedWord(sentence);
        if (!nonRepeatedWord.isEmpty()) {
            System.out.println("The first non-repeated word in the sentence is: " + nonRepeatedWord);
        } else {
            System.out.println("All words in the sentence are repeated.");
        }
    }

    public static String findFirstNonRepeatedWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        String[] words = sentence.toLowerCase().split("\\W+"); // Split by non-word characters
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (String word : words) {
            if (wordCountMap.get(word) == 1) {
                return word;
            }
        }

        return ""; // All words are repeated
    }
}
