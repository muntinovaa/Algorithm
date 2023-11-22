package org.example.pattern16.hashmaps.freq;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SecondMostRepeatedWord {
    public static void main(String[] args) {
        String sequence = "This is a sample sample sentence with with sample sample word.";
        String[] words = sequence.split("\\s+");
        System.out.println(secondMostRepeatedWord(words));

    }

    public static String secondMostRepeatedWord(String[] words){
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        String mostRepeatedWord = "";
        int mostRepeatedCount = 0;
        String secondMostRepeatedWord = "";
        int secondMostRepeatedCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > mostRepeatedCount) {
                secondMostRepeatedWord = mostRepeatedWord;
                secondMostRepeatedCount = mostRepeatedCount;
                mostRepeatedWord = entry.getKey();
                mostRepeatedCount = entry.getValue();
            } else if (entry.getValue() > secondMostRepeatedCount && !entry.getKey().equals(mostRepeatedWord)) {
                secondMostRepeatedWord = entry.getKey();
                secondMostRepeatedCount = entry.getValue();
            }
        }
        System.out.println(mostRepeatedWord);
        return secondMostRepeatedWord;
    }

}
