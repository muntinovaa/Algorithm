package org.example.all.hackerrank;

import java.util.*;

/**
 Complete the implementation of an autocorrect function.
 Given a search query string, the function should return all words which are anagrams.
 Given 2 arrays, words[n], and queries[q], for each query, return an array of the strings that are anagrams,
 sorted alphabetically ascending.
 Note: An anagram is any string that can be formed by rearranging the letters of a string.
 Example
 n = 4, q=2
 words =["duel", "speed", "dule", "cars"],
 queries = ["spede", "deul"].
 The only anagram of "spede" is "speed".
 Both "duel" and "dule" are anagrams of "deul".
 Return [["speed", ["duel", "dule"]].
 Function Description
 Complete the function getSearchResults in the editor below.
 getSearchResults takes the following arguments:
 string words[n]: the list of words to search string queries[q]: the words to search for
 Returns
 string[q][]: the results for each search query
 • 1<n, q ≤ 5000
 • 1 ≤ length of words[i], length of queries[i] < 100
 • It is guaranteed that each query word has at least one anagram in the words list.

 Sample Input For Custom Testing
 STDIN               FUNCTION
 6                   words[] size n = 6
 allot               words = ["allot", "cat", "peach", "dusty", "act", "cheap"]
 cat
 peach
 dusty
 act
 cheap
 3                    queries [] size q = 3
 tac                  queries = ["tac","study", "peahc"]
 study peahc

 Sample Output
 act cat
 dusty
 cheap peach
 */
public class AutocorrectPrototype {
    public static List<List<String>> getSearchResults(List<String> words, List<String> queries) {
        // Map to store sorted word to its anagrams
        Map<String, List<String>> map = new HashMap<>();

        // Populate the map
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            System.out.println("sortedWord: " +sortedWord);
            map.putIfAbsent(sortedWord, new ArrayList<>()); // Does nothing since sortedWord already exists
            map.get(sortedWord).add(word); //It appends the given word to the end of the list.
        }

        // For each sorted word in the map, sort its list of anagrams
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            Collections.sort(entry.getValue());
        }

        // Find anagrams for each query
        List<List<String>> result = new ArrayList<>();
        for (String query : queries) {
            char[] chars = query.toCharArray();
            Arrays.sort(chars);
            String sortedQuery = new String(chars);
            System.out.println("sortedWord1: " +sortedQuery);
            result.add(map.getOrDefault(sortedQuery, null));
            /**List<String> anagrams;
             if (map.containsKey(sortedQuery)) {
             anagrams = map.get(sortedQuery);
             }
             */
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("allot", "cat", "peach", "dusty", "act", "cheap");
        List<String> queries = Arrays.asList("tac", "study", "peahc");
        List<List<String>> result = getSearchResults(words, queries);
        for (List<String> list : result) {
            System.out.println(String.join(" ", list));
        }
    }
}
