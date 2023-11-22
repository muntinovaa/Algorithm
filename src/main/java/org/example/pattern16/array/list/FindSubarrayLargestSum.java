package org.example.pattern16.array.list;

public class FindSubarrayLargestSum {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        System.out.println(findMaxSubarraySum(arr1));
    }
    public static int findMaxSubarraySum(int[] nums) {
        int maxSum = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);
        }

        return maxSum;
    }

}
