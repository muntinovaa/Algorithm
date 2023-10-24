package org.example.all.StringAlgorithm;

public class PigLatinTransformer {
    public static String toPigLatin(String sentence) {
        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            words[i] = convertToPigLatin(words[i]);
        }

        return String.join(" ", words);
    }

    private static String convertToPigLatin(String word) {
        int firstVowelIdx = findFirstVowel(word);

        if (firstVowelIdx == 0) {
            return word + "ay";
        } else if (firstVowelIdx > 0) {
            String prefix = word.substring(0, firstVowelIdx);
            String restOfWord = word.substring(firstVowelIdx);
            return restOfWord + prefix + "ay";
        }
        // If the word doesn't have a vowel, return it as is
        return word;
    }

    private static int findFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String sentence = "Hello World";
        System.out.println(toPigLatin(sentence));  // elloHay orldWay
    }
}
