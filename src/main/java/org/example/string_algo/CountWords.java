package org.example.string_algo;

public class CountWords {
    public static void main(String[] args) {
        String input = "Hello , how many words are in this sentence?";
        System.out.println("Number of words: " + countWords(input));
    }
    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }


}
