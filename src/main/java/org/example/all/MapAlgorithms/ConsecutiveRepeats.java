package org.example.all.MapAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class ConsecutiveRepeats {
    public static Map<Character, Integer> findConsecutiveRepeats(String s) {
        Map<Character, Integer> result = new HashMap<>();

        if (s == null || s.length() == 0) return result;

        char prevChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // If the character is the same as the previous one, increase the count
            if (currentChar == prevChar) {
                count++;
            } else {
                // If count of the previous character is more than 1, update the HashMap
                if (count > 1) {
                    result.put(prevChar, result.getOrDefault(prevChar, 0) + 1);
                }
                // Reset the count and set the current character as the previous character for the next iteration
                count = 1;
                prevChar = currentChar;
            }
        }

        // Check for the last character sequence
        if (count > 1) {
            result.put(prevChar, result.getOrDefault(prevChar, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "abbbcddddeffabbbbbb";
        Map<Character, Integer> resultMap = findConsecutiveRepeats(input);
        for (Map.Entry<Character, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
