package org.example.all.StringAlgorithm;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String sentence = "this is a test sentence.";
        String capitalized = capitalizeFirstLetter(sentence);
        System.out.println(capitalized);  // Output: "This Is A Test Sentence."
    }

    public static String capitalizeFirstLetter(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        String[] words = sentence.split("\\s+");  // Split the sentence by whitespace
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        // Remove the trailing space and return the result
        return capitalizedSentence.toString().trim();
    }
}
