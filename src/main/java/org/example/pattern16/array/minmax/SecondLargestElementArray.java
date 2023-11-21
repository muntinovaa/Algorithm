package org.example.pattern16.array.minmax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class SecondLargestElementArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest element is: " + secondLargest);
    }

    public static int findSecondLargest(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("All elem equal array.");
        }
        return secondMax;
    }

    public static int findSecondLargest1(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        OptionalInt secondMax = Arrays.stream(nums)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .mapToInt(Integer::intValue)
                .findFirst();

        return secondMax.orElseThrow(() -> new IllegalArgumentException("All elements are equal in the array."));
    }

}