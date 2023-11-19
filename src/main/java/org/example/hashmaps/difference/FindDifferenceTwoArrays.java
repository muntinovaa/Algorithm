package org.example.hashmaps.difference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//2215. Find the Difference of Two Arrays
// We are given two integer arrays, nums1 and nums2,
// and need to return a list of two lists.
// The first list has the elements that are present only in nums1,
// while the second list has the elements that are present only in nums2.
public class FindDifferenceTwoArrays {
    public static void main(String[] args) {
       int [] nums1 ={1,2,3,3};
       int [] nums2 ={1,1,2,2};
       System.out.println(findDifference(nums1,nums2));

    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }

        List<Integer> list1 = new ArrayList<>(set1);
        List<Integer> list2 = new ArrayList<>(set2);
        list1.removeAll(set2);
        result.add(list1);
        list2.removeAll(set1);
        result.add(list2);

        return result;
    }
}
