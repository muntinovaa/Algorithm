package org.example.all.MapAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static Character findFirstNonRepeated(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        // 1st pass: populate the map with character frequency
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // 2nd pass: find the first non-repeated character
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return null; // return null if all characters are repeated
    }

    public static void main(String[] args) {
        String input = "swiss";
        Character result = findFirstNonRepeated(input);
        if (result != null) {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("All characters are repeated.");
        }
    }
}
