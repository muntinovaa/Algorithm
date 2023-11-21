package org.example.pattern16.array.minmax;

public class SecondLargestElementArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest element is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = j;
            } else if (j > secondLargest && j != firstLargest) {
                secondLargest = j;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("There is no second largest element");
        }

        return secondLargest;
    }
}