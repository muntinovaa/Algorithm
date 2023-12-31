package org.example.pattern16.hashmaps.freq;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentSubstring {
    public static void main(String[] args) {
        String s = "AABCABBCBBA";
        int k = 3;
        System.out.println("Most frequent substring of length "
                + k + ": " + mostFrequentSubstring(s, k));
    }
    public static String mostFrequentSubstring(String s, int k) {
        if (s == null || s.isEmpty() || k > s.length()) {
            return null;
        }

        Map<String, Integer> substringCount = new HashMap<>();
        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            substringCount.put(substring, substringCount.getOrDefault(substring, 0) + 1);
        }

        String mostFrequent = null;
        Integer maxCount = 0;
        for (Map.Entry<String, Integer> entry : substringCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        return mostFrequent;
    }


}
