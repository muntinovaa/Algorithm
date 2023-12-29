package org.example.pattern16.twopointers;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(myArray)));

    }

    public static int[] reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap the elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the pointers
            start++;
            end--;
        }

        return array;
    }

}
