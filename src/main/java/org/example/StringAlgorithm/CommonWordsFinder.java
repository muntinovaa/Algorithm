package org.example.StringAlgorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonWordsFinder {
    public static void main(String[] args) {
        String sentence1 = "Hello world, programming is fun";
        String sentence2 = "Hello everyone, coding and programming are enjoyable";
        System.out.println(findCommonWords(sentence1, sentence2));  // [hello, programming]
    }

    public static Set<String> findCommonWords(String sentence1, String sentence2) {
        if (sentence1 == null || sentence2 == null) {
            return new HashSet<>();
        }

        // Convert sentences to lowercase and split into words
        Set<String> wordsSet1 = new HashSet<>(Arrays.asList(sentence1.toLowerCase().split("\\W+")));
        Set<String> wordsSet2 = new HashSet<>(Arrays.asList(sentence2.toLowerCase().split("\\W+")));

        // Retain only the words that are present in both sets
        wordsSet1.retainAll(wordsSet2);

        return wordsSet1;
    }
}
