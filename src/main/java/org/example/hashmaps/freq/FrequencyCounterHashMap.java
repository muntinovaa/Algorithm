package org.example.hashmaps.freq;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounterHashMap{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple",
                "banana", "orange", "apple",
                "apple", "banana", "grape");
        Map<String, Integer> frequency = frequencyCounter(words);

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public static Map<String, Integer> frequencyCounter(List<String> words) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
              frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }


}
