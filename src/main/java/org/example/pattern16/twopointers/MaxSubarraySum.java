package org.example.pattern16.twopointers;

public class MaxSubarraySum {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 1;
        System.out.println("Maximum sum of a subarray of size " + k + ": " + findMaxSumSubarray(arr, k));
        // This will output the maximum sum of a subarray of size 3
    }

    // Function to find the maximum sum of a subarray of size k
    public static int findMaxSumSubarray(int[] arr, int k) {
        int maxSum = 0; // This will store the maximum sum we have found so far
        int windowSum = 0; // This will store the current sum of the window
        int windowStart = 0; // This is the start index of our sliding window

        // Loop to iterate over the array
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd]; // Add the next element into our current window sum

            // Check if we've hit the size of our window (k)
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum); // Update maxSum with the greater value between maxSum and windowSum
                windowSum -= arr[windowStart]; // Subtract the element at the start of the window, as we'll slide the window forward
                windowStart++; // Slide the window forward by incrementing the start index
            }
        }

        return maxSum; // Return the maximum sum found
    }
}
