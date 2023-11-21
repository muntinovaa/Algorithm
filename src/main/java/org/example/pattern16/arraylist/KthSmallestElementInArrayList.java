package org.example.pattern16.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class KthSmallestElementInArrayList {
    public static void main(String[] args) {
        KthSmallestElementInArrayList solution = new KthSmallestElementInArrayList();
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(7, 10, 4, 3, 20, 15));
        int k = 3;
        System.out.println(solution.findKthSmallest(nums, k)); // Should print 7
        System.out.println(solution.findKthSmallest1(nums, k)); // Should print 7
    }

    public Integer findKthSmallest(ArrayList<Integer> nums, int k) {
        if (nums == null || nums.isEmpty()) return null;
        return quickSelect(nums, k - 1, 0, nums.size() - 1);
    }
    public Integer findKthSmallest1(ArrayList<Integer> nums, int k) {
        if (nums == null || nums.size() < k) return null;
        Collections.sort(nums);
        return nums.get(k - 1);
    }


    private int quickSelect(ArrayList<Integer> nums, int k, int start, int end) {
        if (start > end) return Integer.MAX_VALUE;

        Random rand = new Random();
        int pivotIdx = start + rand.nextInt(end - start + 1);
        int pivotVal = nums.get(pivotIdx);
        swap(nums, pivotIdx, end);

        int left = start;
        for (int i = start; i < end; i++) {
            if (nums.get(i) < pivotVal) {
                swap(nums, i, left);
                left++;
            }
        }

        swap(nums, left, end);

        if (left == k) return nums.get(left);
        else if (left < k) return quickSelect(nums, k, left + 1, end);
        else return quickSelect(nums, k, start, left - 1);
    }

    private void swap(ArrayList<Integer> nums, int i, int j) {
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }


}
