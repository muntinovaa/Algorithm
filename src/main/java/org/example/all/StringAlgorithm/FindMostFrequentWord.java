package org.example.all.StringAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class FindMostFrequentWord {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the quick dog";
        String mostFrequentWord = findMostFrequentWord(sentence);
        System.out.println("The most frequent word in the sentence is: " + mostFrequentWord);
    }

    private static String findMostFrequentWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        String[] words = sentence.toLowerCase().split("\\W+"); // Split by non-word characters
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        String mostFrequentWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequentWord;

    }

}
