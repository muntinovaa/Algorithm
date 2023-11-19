package org.example.hashmaps.freq;

import java.util.HashMap;
import java.util.Map;

/**
 Given an integer array nums and an integer k,
 return true if there are two distinct indices i and j
 in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 Example 1: Input: nums = [1,2,3,1], k = 3
 Output: true
 Example 2: Input: nums = [1,0,1,1], k = 1
 Output: true
 Example 3: Input: nums = [1,2,3,1,2,3], k = 2
 Output: false
 * */
public class ContainsDuplicateII {
  public static void main(String[] args) {
    System.out.println(containsNearbyDuplicate(new int[] {1, 2, 3, 1}, 3)); // Output: true
    System.out.println(containsNearbyDuplicate(new int[] {1, 0, 1, 1}, 1)); // Output: true
    System.out.println(containsNearbyDuplicate(new int[] {1, 2, 3, 1, 2, 3}, 2)); // Output: false

  }
  public static boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> numIndices = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (numIndices.containsKey(nums[i]) && i - numIndices.get(nums[i]) <= k) {
        return true;
      }
      numIndices.put(nums[i], i);
    }

    return false;
  }

}
