package org.example.string_algo.converter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCaseConverter {
    public static void main(String[] args) {
        String sentence = "convert this";
        String camelCase = toCamelCase(sentence);
        String camelCase1 = toCamelCase1(sentence);
        String camelCase2 = toCamelCase2(sentence);
        System.out.println(camelCase);
        System.out.println(camelCase1);
        System.out.println(camelCase2);

    }

    public static String toCamelCase(String str) {
        String[] words = str.split("\\s+");
        String result = words[0].toLowerCase();

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            result += Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
        }
        return result;
    }

    public static String toCamelCase2(String str) {
        String camelCase = Arrays.stream(str.split("\\s+"))
                .map(word -> word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase())
                .collect(Collectors.joining());
        camelCase = Character.toLowerCase(camelCase.charAt(0)) + camelCase.substring(1);
        return camelCase;
    }

    public static String toCamelCase1(String str) {
        StringBuilder builder = new StringBuilder();
        String[] words = str.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                builder.append(word.toLowerCase());
            } else {
                builder.append(Character.toUpperCase(word.charAt(0)));
                builder.append(word.substring(1).toLowerCase());
            }
        }
        return builder.toString();
    }

}
