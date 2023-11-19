package org.example.hashmaps.freq;

import java.util.HashMap;
import java.util.Map;

/**
 Given an array nums of size n, return the majority element.
 The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 Example 1: Input: nums = [3,2,3]
 Output: 3
 Example 2: Input: nums = [2,2,1,1,1,2,2]
 Output: 2

 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (Integer intKey: nums){
            map.put(intKey,map.getOrDefault(intKey,0) + 1);
        }
         int majorityElement = nums[0];
         int maxValue=0;
         for (Map.Entry<Integer,Integer> integerEntry : map.entrySet()){
             if(integerEntry.getValue()>maxValue){
                 maxValue= integerEntry.getValue();
                 majorityElement = integerEntry.getKey();
             }
         }
         return majorityElement;

    }


}
