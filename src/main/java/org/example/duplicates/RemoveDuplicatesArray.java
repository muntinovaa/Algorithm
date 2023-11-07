package org.example.duplicates;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 7, 2, 5, 3, 7, 8};
        int[] result1 = removeDuplicates1(arr1);

        System.out.println(Arrays.toString(result1));  // Outputs: [5, 3, 7, 2, 8]
        int[] sortedArr = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        int[] result = removeDuplicates1(sortedArr);
        System.out.println(Arrays.toString(result));  // Outputs: [1, 2, 3, 4, 5]
    }

        public static int[] removeDuplicates1(int[] nums) {
            // Use a HashSet to store unique numbers
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            // Convert the set back to an array
            int[] result = new int[set.size()];
            int i = 0;
            for (int num : set) {
                result[i++] = num;
            }
            return result;
        }
}
