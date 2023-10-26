package org.example.string_algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsString {
    public static void main(String[] args) {
        String text = "cdcdcdaebabacddc";
        String pattern = "cd";
        List<Integer> indices = findAnagrams(text, pattern);
        for (Integer i: indices){
            System.out.println(i);
        }
        System.out.println(indices);  // [0, 6]
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.isEmpty() || p == null || p.isEmpty()) {
            return result;
        }

        Map<Character, Integer> patternMap = new HashMap<>();
        for (char c : p.toCharArray()) {
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }

        int start = 0, end = 0, counter = patternMap.size();

        while (end < s.length()) {
            char c = s.charAt(end);
            if (patternMap.containsKey(c)) {
                patternMap.put(c, patternMap.get(c) - 1);
                if (patternMap.get(c) == 0) counter--;
            }
            end++;

            while (counter == 0) {
                char temp = s.charAt(start);
                if (patternMap.containsKey(temp)) {
                    patternMap.put(temp, patternMap.get(temp) + 1);
                    if (patternMap.get(temp) > 0) counter++;
                }
                if (end - start == p.length()) {
                    result.add(start);
                }
                start++;
            }
        }

        return result;
    }


}
