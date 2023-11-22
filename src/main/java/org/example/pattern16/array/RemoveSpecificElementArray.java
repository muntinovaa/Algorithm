package org.example.pattern16.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveSpecificElementArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(removeSpecificElementArray(numbers,1)));
        System.out.println(Arrays.toString(removeSpecificElementArray1(numbers,1)));
    }
    public static int[] removeSpecificElementArray(int [] arr, int elem){
        int count = 0; // Count of elements to keep
        // Count how many elements to keep (not equal to 'elem')
        for (int j : arr) {
            if (j != elem) {
                count++;
            }
        }
        // Create a new array to store the elements to keep
        int[] result = new int[count];
        int index = 0; // Index for the 'result' array
        // Copy elements from 'arr' to 'result', excluding 'elem'
        for (int j : arr) {
            if (j != elem) {
                result[index++] = j;
            }
        }
        return result;
    }
    public static int[] removeSpecificElementArray1(int[] arr, int elem) {
        return IntStream.of(arr)
                .filter(e -> e != elem)
                .toArray();
    }
}
