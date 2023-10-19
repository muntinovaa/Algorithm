package org.example.StringAlgorithm;

public class FindLongestWord {
    public static void main(String[] args) {
        String input = "QWERTY asfg daffy sdfg deft ddff as as as as";
        String longestWord = findLongestWord(input);
        System.out.println("Longest word: " + longestWord);

        //output: QWERTY
    }

    public static String findLongestWord(String input) {
        String[] words = input.split("\\s+");  // Split string into words
        String longestWord = "";               // To store the longest word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

}
