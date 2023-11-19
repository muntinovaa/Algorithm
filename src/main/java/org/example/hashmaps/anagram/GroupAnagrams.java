package org.example.hashmaps.anagram;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "xyz", "nat"};
        List<List<String>> result = groupAnagrams(input);
        System.out.println(groupAnagrams(input));
        System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(String[] str){
        Map<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char[] characters = s.toCharArray();
            Arrays.sort(characters);
            String key = String.valueOf(characters);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);

           /***
           if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
           **/
        }

        return new ArrayList<>(map.values());
    }
}
