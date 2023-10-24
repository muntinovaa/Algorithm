package org.example.all.MapAlgorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {
    public static Map<String, Integer> countFrequency(List<String> words) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
      /*  List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple", "mango");
        Map<String, Integer> frequency = countFrequency(words);
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/
    }
}
