package org.example.ArrayAlgorithm;

public class SecondMaxInArray {
    public static int findSecondMax(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second maximum element");
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 3, 8, 2};
        int secondMax = findSecondMax(arr);
        System.out.println("Second maximum integer: " + secondMax);
    }
}
