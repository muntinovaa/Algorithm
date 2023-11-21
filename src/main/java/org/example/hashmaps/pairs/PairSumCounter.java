package org.example.hashmaps.pairs;

import java.util.HashMap;
import java.util.Map;

public class PairSumCounter {
    public static int countPairsWithSum(int[] arr, int K) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            // Calculate complement of current number with respect to K
            int complement = K - num;
            // If complement is found in map, we found a pair
            if (freqMap.containsKey(complement)) {
                count += freqMap.get(complement);
            }

            // Update frequency of current number
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int K = 6;
        System.out.println(countPairsWithSum(arr, K));  // Should print 3
    }
}
