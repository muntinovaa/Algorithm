package org.example.all.StringAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class MostCommonLetterFinder {
    public static char findMostCommonLetter(String s) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Convert to lowercase for case-insensitivity and iterate through the string
        for (char c : s.toLowerCase().toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        char mostCommon = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostCommon;
    }

    public static void main(String[] args) {
        String testString = "Hello, World!";
        System.out.println("Most Common Letter: " + findMostCommonLetter(testString));
    }
}
