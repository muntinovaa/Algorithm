package org.example.hashmaps.freq;

import java.util.HashMap;
import java.util.Map;

/**
 Given an integer array nums, return the most frequent even element.

 If there is a tie, return the smallest one. If there is no such element, return -1.
 Example 1: Input: nums = [0,1,2,2,4,4,1]
 Output: 2
 Explanation:
 The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
 We return the smallest one, which is 2.
 Example 2: Input: nums = [4,4,4,9,2,4]
 Output: 4
 Explanation: 4 is the even element appears the most.
 Example 3: Input: nums = [29,47,21,41,13,37,25,7]
 Output: -1
 Explanation: There is no even element.
 * */
public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int [] nums = {1,2,3,2,6};
        System.out.println(mostFrequentEven(nums));
        System.out.println(mostFrequentEven1(nums));
    }
   public static Integer mostFrequentEven(int[] nums) {
       Map<Integer, Integer> map = new HashMap<>();

       for (Integer number : nums) {
           if (number % 2 == 0) {
               map.put(number, map.getOrDefault(number, 0) + 1);
           }
       }
       int maxValue = Integer.MIN_VALUE;
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           if (maxValue < entry.getValue()) {
               maxValue = entry.getValue();
           }

       }

       return maxValue;
   }

    public static int mostFrequentEven1(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        Integer mostFrequentEven = null;

        for (int num : nums) {
            if (num % 2 == 0) {
                int frequency = frequencyMap.getOrDefault(num, 0) + 1;
                frequencyMap.put(num, frequency);

                if (frequency > maxFrequency || (frequency == maxFrequency && num < mostFrequentEven)) {
                    maxFrequency = frequency;
                    mostFrequentEven = num;
                }
            }
        }

        return mostFrequentEven != null ? mostFrequentEven : -1;
    }
}
