package org.example.array.minmax;

public class FindMinimumValueArray {
    public static int findMinimum(int[] arr) {

        int minimum = arr[0];

        //At every Index compare its value with minimum and if its less
        //then make that index value new minimum value
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    } //end of findMinimum

    public static void main(String args[]) {

        int[] arr = { 9, 2, 3, 6};

        System.out.print("Array : ");
        for (int j : arr) System.out.print(j + " ");
        System.out.println();

        int min = findMinimum(arr);
        System.out.println("Minimum in the Array: " + min);

    }
}
