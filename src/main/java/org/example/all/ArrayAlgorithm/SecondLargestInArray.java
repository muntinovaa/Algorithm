package org.example.all.ArrayAlgorithm;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] array = { 45, 78, 34, 2, 67, 89, 23, 67, 78 };
        System.out.println("Second Largest: " + findSecondLargest(array));
    }

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        // If secondLargest is still Integer.MIN_VALUE, it means there is no second largest number
        if (secondLargest == Integer.MAX_VALUE) {
            throw new RuntimeException("No second largest number found.");
        }

        return secondLargest;
    }
}
