package org.example.all.StringAlgorithm;

public class FindShortestWord {
    public static void main(String[] args) {
        String input = "QWERTY asfg daffy sdfg deft ddff as as as as sd t";
        String longestWord = findShortestWord(input);
        System.out.println("Longest word: " + longestWord);
    }

    public static String findShortestWord(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        String[] words = input.split("\\s+");  // Split string into words
        String shortestWord = words[0];               // To store the longest word
        for (String word : words) {
            if (shortestWord.length() > word.length()) {
                shortestWord = word;
            }
        }
        return shortestWord;
    }
}
