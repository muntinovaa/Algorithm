package org.example.Anagrams;

import java.util.*;

/**
 * Find anagrams from a string array
 */
public class AnagramFinderStringArray {
    /* Input:  {"listen", "enlist", "rat", "tar", "god", "dog", "evil"} */
    /* Output: [rat, tar] [listen, enlist] [god, dog]                   */
    public static void main(String[] args) {
        String[] strings = {"listen", "enlist", "rat", "tar", "god", "dog", "evil"};
        Map<String, ArrayList<Object>> anagrams = findAnagrams(strings);

        for (ArrayList<Object> group : anagrams.values()) {
            System.out.println(group);
        }
    }

    // Helper function to get the sorted representation of a string
    private static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static Map<String, ArrayList<Object>> findAnagrams(String[] strs) {
        Map<String, ArrayList<Object>> map = new HashMap<>();

        for (String str : strs) {
            String sorted = sortString(str);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }

        // Optionally, you can filter out entries that have just one string, as those are not anagrams with any other string
        map.values().removeIf(list -> list.size() == 1);

        return map;
    }



}
