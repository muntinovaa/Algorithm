package org.example.pattern16.hashmaps.unsolved.frequency.comparator;

import java.util.*;

public class TopNFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        // Count the frequency of each word
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Convert the frequency map to a list of entries
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(frequencyMap.entrySet());

        // Sort the entry list using the custom comparator
        Collections.sort(entries, new FrequencyComparator());

        // Extract the top k words
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(entries.get(i).getKey());
        }

        return result;
    }

    public static void main(String[] args) {
        TopNFrequentWords solution = new TopNFrequentWords();
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        List<String> topKWords = solution.topKFrequent(words, k);
        System.out.println("Top " + k + " frequent words: " + topKWords);
    }

}