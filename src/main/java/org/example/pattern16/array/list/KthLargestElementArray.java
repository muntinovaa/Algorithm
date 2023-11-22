package org.example.pattern16.array.list;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementArray {
    public static int findKthLargestBySorting(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
    public static int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            // Handle invalid input gracefully
            return 0;
        }
        // Create a max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Add elements to the max heap
        for (int num : nums) {
            maxHeap.offer(num);
        }

        // Remove the top k - 1 elements
        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }

        // The top element is the Kth largest
        return maxHeap.poll();
    }
    public static int findKthLargestUsingHeap(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.offer(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }

    public static int findKthLargestQuickSelect(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private static int quickSelect(int[] nums, int low, int high, int k) {
        int pivot = partition(nums, low, high);
        if (pivot == k) {
            return nums[pivot];
        } else if (pivot < k) {
            return quickSelect(nums, pivot + 1, high, k);
        } else {
            return quickSelect(nums, low, pivot - 1, k);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivotValue = nums[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (nums[j] <= pivotValue) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, high);
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
