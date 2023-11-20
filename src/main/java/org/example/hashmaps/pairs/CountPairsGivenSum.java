package org.example.hashmaps.pairs;

import java.util.HashMap;
import java.util.Map;

public class CountPairsGivenSum {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 1};
        int k1 = 6;
        System.out.println(getPairsCount(arr1, arr1.length, k1)); // Output: 2

        int[] arr2 = {1, 1, 1, 1};
        int k2 = 2;
        System.out.println(getPairsCount(arr2, arr2.length, k2)); // Output: 6
    }


    public static int getPairsCount(int[] arr, int n, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = k - num;
            if (frequencyMap.containsKey(complement)) {
                count += frequencyMap.get(complement);
            }
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }


}
