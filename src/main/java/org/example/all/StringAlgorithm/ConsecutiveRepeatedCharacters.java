package org.example.all.StringAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveRepeatedCharacters {
        public static List<String> findConsecutiveRepeatedCharacters(String input) {
            List<String> result = new ArrayList<>();

            char currentChar = '\0';
            int currentCount = 0;

            for (char c : input.toCharArray()) {
                if (c == currentChar) {
                    currentCount++;
                } else {
                    if (currentCount > 1) {
                        result.add(currentChar + ":" + currentCount);
                    }
                    currentChar = c;
                    currentCount = 1;
                }
            }

            if (currentCount > 1) {
                result.add(currentChar + ":" + currentCount);
            }

            return result;
        }

        public static void main(String[] args) {
            String input = "aabcdeefgee";
            List<String> result = findConsecutiveRepeatedCharacters(input);

            System.out.println(result); // Should print [aa:1, ee:2]
        }
}
