package org.example.pattern16.array.minmax;

public class FindMinimumValueArray {
    public static void main(String []args) {
        int[] arr = { 9, 2, 3, 6};
        System.out.print("Array : ");
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
        int min = findMinimum(arr);
        int min1 = findMinimum1(arr);
        System.out.println("Minimum in the Array: " + min);
        System.out.println("Minimum in the Array: " + min1);

    }
    public static int findMinimum(int[] arr) {
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public static int findMinimum1(int[] arr) {
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            minimum = Math.min(minimum, arr[i]);
        }
        return minimum;
    }
}
