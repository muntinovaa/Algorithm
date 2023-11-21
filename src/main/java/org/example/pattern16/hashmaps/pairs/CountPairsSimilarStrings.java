package org.example.pattern16.hashmaps.pairs;

import java.util.HashMap;
import java.util.Map;

public class CountPairsSimilarStrings {
    public static void main(String[] args) {

    }
    public int similarPairs(String[] words) {
        Map<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            String h = computeHash(word);
            counts.put(h, counts.getOrDefault(h, 0) + 1);
            System.out.println(h);
        }

        int sum = 0;
        for (int c : counts.values())
            sum += pairs(c);

        return sum;
    }

    private int pairs(int n) {
        // n Choose 2
        return n * (n - 1) / 2;
    }

    private String computeHash(String s) {
        boolean[] a = new boolean[26];
        for (char c : s.toCharArray()) {
            a[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++)
            if (a[i])
                sb.append((char)('a' + i));
        return sb.toString();
    }
}
