package org.example.StringAlgorithm;

public class VowelRemover {
    public static String removeVowels(String input) {
        // Create a StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Check if the character is not a vowel
            if (!isVowel(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println(removeVowels(input));  // Hll Wrld
    }
}
