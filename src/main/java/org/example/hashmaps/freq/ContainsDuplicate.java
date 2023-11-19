package org.example.hashmaps.freq;

import java.util.HashSet;
import java.util.Set;

/**
 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 Example 1: Input: nums = [1,2,3,1]
 Output: true
 Example 2: Input: nums = [1,2,3,4]
 Output: false
 Example 3: Input: nums = [1,1,1,3,3,4,3,2,4,2]
 Output: true
 * */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            seen.add(num);
        }
        return false; // No duplicates found
    }

}
