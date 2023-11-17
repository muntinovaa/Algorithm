package org.example.hashmaps.freq.comparator;

import java.util.Comparator;
import java.util.Map;

public class FrequencyComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
        if (a.getValue().equals(b.getValue())) {
            return a.getKey().compareTo(b.getKey()); // Alphabetical order for tie
        }
        return b.getValue() - a.getValue(); // Descending order of frequency
    }
}