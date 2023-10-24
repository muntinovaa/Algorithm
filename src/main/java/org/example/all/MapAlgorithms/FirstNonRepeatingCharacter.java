package org.example.all.MapAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static int firstNonRepeatingChar(String s) {
        // Create a frequency map for characters in the string
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Populate the frequency map
        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Iterate through the string to find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charFrequency.get(c) == 1) {
                return i;
            }
        }

        // If no non-repeating character is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "oldnavy";
        int result1 = firstNonRepeatingChar(s1);
        System.out.println(result1); // Should print 0

        String s2 = "loveoldnavy";
        int result2 = firstNonRepeatingChar(s2);
        System.out.println(result2); // Should print 3
    }
}
