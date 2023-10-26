package org.example.string_algo;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String input = "find first";

        System.out.println(firstUniqueChar(input));
    }

    public static Character firstUniqueChar(String input) {
        // Handle null and empty strings
        if (input == null || input.isEmpty()) {
            return null;
        }
        // Use an array to keep track of character frequencies, assuming ASCII characters
        int[] charFrequency = new int[256];
        // Populate the frequency array
        for (char c : input.toCharArray()) {
            charFrequency[c]++;
        }

        // Iterate through the string to find the first character with a frequency of 1
        for (char c : input.toCharArray()) {
            System.out.println(charFrequency[c]);
            if (charFrequency[c] == 1) {
                return c;
            }
        }
        // If no unique character is found
        return null;
    }
}
