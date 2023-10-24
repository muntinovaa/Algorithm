package org.example.all.StringAlgorithm;

import java.util.*;
import java.util.stream.Collectors;

public class MostCommonWord {
    /**

     Given a string paragraph and a string array of the banned words banned,
     return the most frequent word that is not banned.
     It is guaranteed there is at least one word that is not banned,
     and that the answer is unique.
     The words in paragraph are case-insensitive and the answer should be returned in lowercase.

     Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
     Output: "ball"
     Explanation:
     "hit" occurs 3 times, but it is a banned word.
     "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
     Note that words in the paragraph are not case sensitive,
     that punctuation is ignored (even if adjacent to words, such as "ball,"),
     and that "hit" isn't the answer even though it occurs more because it is banned.
     **/

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = { "hit" };

        String mostFrequent = mostFrequentWord(paragraph, banned);
        System.out.println(mostFrequent);

        System.out.println("This program ranks countries on the basis of land-area covered.");
        System.out.println("Each key in the HashMap is a rank and each corresponding value is a country name.");

        // create an HashMap
        HashMap<Integer, String> countries = new HashMap<>();

        // populate the HashMap
        countries.put(1, "russia");
        countries.put(2, "canada");
        countries.put(3, "china");
        countries.put(4, "united states");
        System.out.println("**Printing HashMap**");
        System.out.println(countries);

        //Apply getOrDefault function
        String a = countries.getOrDefault(3, "No entry found!");
        String b = countries.getOrDefault(5, "No entry found!");

        System.out.println("The value returned for key = 3: " + a);
        System.out.println("The value returned for key = 5: "+ b);
    }

    public static String mostFrequentWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = paragraph.toLowerCase().split("[!?',;.\\s]+");

        for (String word : words) {
            if (!bannedSet.contains(word)) {
                System.out.println(wordCount.getOrDefault(word, 0)+1 + " "+ word );
                System.out.println("----------");
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        String mostFrequent = "";
        int maxCount = 0;
        System.out.println("----------");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
                System.out.println(maxCount + " "+ mostFrequent);
            }
        }

        return mostFrequent;
    }

    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> bannedSet = Arrays.stream(banned)
                .collect(Collectors.toSet());

        Map<String,Integer> count = new HashMap<>();

        Arrays.stream(paragraph.replaceAll("[^a-zA-Z0-9]+"," ").split(" "))
                .map(String::toLowerCase)
                // .peek(System.out::println)
                .filter(word -> !bannedSet.contains(word))
                .forEach(word -> count.put(word, count.getOrDefault(word,0)+1) );

        return count.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("");
    }


}
