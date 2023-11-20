package org.example.hashmaps.freq;

import java.util.HashMap;
import java.util.Map;

/**
 Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
 Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
 Example 1: Input: nums1 = [1,2,3], nums2 = [2,4]
 Output: 2 Explanation: The smallest element common to both arrays is 2, so we return 2.
 Example 2:  Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
 Output: 2 Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
 * */
public class MinimumCommonValue {
    public static void main(String[] args) {
        int[] nums1 = {2,2,5,6};
        int[] nums2 = {2,2,1,1,6};
        System.out.println(getMinCommon(nums1,nums2));
    }
    public static int getMinCommon(int[] nums1, int[] nums2) {
        Map<Integer,Boolean> map = new HashMap<>();
        for (int number1: nums1){
            map.put(number1, true);
        }
        int min = Integer.MAX_VALUE;
        for (int number2: nums2){
            if(map.containsKey(number2)) {
                if(number2<min){
                     min=number2;
                }
            }
        }

       return min == Integer.MAX_VALUE ? -1 : min;
    }
}
