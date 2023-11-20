package org.example.hashmaps.pairs;

import java.util.HashMap;
import java.util.Map;

//2341. Maximum Number of Pairs in Array
public class MaximumNumberPairsArray {
    public static void main(String[] args) {

    }

    public static int[] maxNumberOfPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int pairCount = 0;
        int leftoverCount = 0;

        // Count occurrences of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Count pairs and leftovers
        for (int count : countMap.values()) {
            pairCount += count / 2;
            leftoverCount += count % 2;
        }

        return new int[]{pairCount, leftoverCount};
    }
}
