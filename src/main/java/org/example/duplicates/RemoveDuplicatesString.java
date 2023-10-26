package org.example.duplicates;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesString {
    public static void main(String[] args) {
        String str = "banana";
        System.out.println(removeDuplicates(str));  // Outputs: "ban"
    }

    public static String removeDuplicates(String s) {
    char[] chars = s.toCharArray();

    for (int i = 0; i < chars.length; i++) {
        for (int j = i + 1; j < chars.length; j++) {
            if (chars[i] == chars[j]) {
                chars[j] = '\0';  // placeholder for duplicates
            }
        }
    }

    // Constructing the new string without placeholders
    int newIndex = 0;
    for (int i = 0; i < chars.length; i++) {
        if (chars[i] != '\0') {
            chars[newIndex++] = chars[i];
        }
    }

    return new String(chars, 0, newIndex);
}

    public static String removeDuplicates1(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static String removeDuplicates2(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sb.indexOf(String.valueOf(c)) == -1) { // character not in the StringBuilder
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static String removeDuplicates3(String s) {
        return s.chars()  // IntStream
                .distinct()  // Removes duplicates
                .mapToObj(c -> (char) c)  // Convert IntStream to Stream<Character>
                .map(String::valueOf)  // Convert Stream<Character> to Stream<String>
                .collect(Collectors.joining());  // Join characters into a single string
    }

    public static String removeDuplicates4(String s) {
        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }





}
