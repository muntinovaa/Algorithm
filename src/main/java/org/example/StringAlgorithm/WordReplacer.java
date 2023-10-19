package org.example.StringAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class WordReplacer {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "hi");
        dictionary.put("world", "earth");
        String sentence = "hello world, how are you in this beautiful world?";
        System.out.println(replaceWords(dictionary, sentence));  // "hi earth, how are you in this beautiful earth?"
    }

    public static String replaceWords(Map<String, String> dictionary, String sentence) {
        if (dictionary == null || sentence == null || dictionary.isEmpty()) {
            return sentence;
        }

        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");

        for (String word : words) {
            // Remove punctuation for matching
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            if (dictionary.containsKey(cleanWord)) {
                // Replace word but keep the punctuation
                result.append(word.replace(cleanWord, dictionary.get(cleanWord))).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}
