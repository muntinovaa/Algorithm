package org.example.hashset;

import java.util.HashSet;
import java.util.Set;

public class NumberDistinctAverages {
    public static void main(String[] args) {

    }
    public static int findNumberOfDistinctAverages(int[] nums) {
        Set<Double> averages = new HashSet<>();
        int n = nums.length;
        int totalSubsets = 1 << n; // Total subsets is 2^n

        for (int i = 1; i < totalSubsets; i++) {
            double sum = 0;
            int count = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // Check if jth element is in the subset
                    sum += nums[j];
                    count++;
                }
            }
            if (count > 0) {
                averages.add(sum / count);
            }
        }

        return averages.size();
    }
}
