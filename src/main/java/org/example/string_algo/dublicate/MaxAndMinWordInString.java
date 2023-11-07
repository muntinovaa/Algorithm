package org.example.string_algo.dublicate;

import java.util.Arrays;
import java.util.Comparator;

public class MaxAndMinWordInString {
    public static void main(String[] args) {
        String text = "This is a simple test string to demonstrate the program";
        findSmallestAndLargestWord(text);
        findSmallestAndLargestWordStream1(text);
    }

    public static void findSmallestAndLargestWord(String str) {
        String[] words = str.split("\\s+"); // Split the string into words using space as separator

        String smallestWord = words[0]; // Initialize with the first word
        String largestWord = "";

        for (String word : words) {
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        System.out.println("Smallest word: " + smallestWord);
        System.out.println("Largest word: " + largestWord);
    }

    public static void findSmallestAndLargestWordStream1(String str) {
        String[] words = str.split("\\s+");

        String smallestWord = Arrays.stream(words)
                .min(Comparator.comparingInt(String::length))
                .orElse("");

        String largestWord = Arrays.stream(words)
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println("Smallest word: " + smallestWord);
        System.out.println("Largest word: " + largestWord);
    }
}
