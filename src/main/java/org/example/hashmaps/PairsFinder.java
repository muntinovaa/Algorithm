package org.example.hashmaps;
import java.util.*;

public class PairsFinder {
    public static int countPairs(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Step 1: Create frequency map
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        // Step 2: Count pairs
        for (int key : freqMap.keySet()) {
            if (freqMap.containsKey(key + k) && (key != key + k || freqMap.get(key) > 1)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(countPairs(arr, k));  // Output: 3 (because (1,3), (2,4) and (3,5) are valid pairs)
    }


}
