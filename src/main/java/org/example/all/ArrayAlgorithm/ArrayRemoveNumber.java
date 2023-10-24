package org.example.all.ArrayAlgorithm;

import java.util.Arrays;

/**
 The problem describes removing a given number from an array.
 If you remove elements from the array, the size of the array will change.
 To maintain the size of the array as constant,
 the given solution sets the elements to 0 at the positions of the removed numbers.
 */
public class ArrayRemoveNumber {

   public static void main(String[] args) {
            int[] arr1 = {2, 2, 4, 5, 2, 5};
            int[] arr2 = {2, 2, 4, 5, 2, 5};

            System.out.println(Arrays.toString(RemoveNum(arr1, 2)));  // Output: [4, 5, 5, 0, 0, 0]
            System.out.println(Arrays.toString(RemoveNum(arr2, 5)));  // Output: [2, 2, 4, 2, 0, 0]
        }

        public static int[] RemoveNum(int[] arr, int num) {
            int index = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != num) {
                    arr[index++] = arr[i];
                    System.out.println("1:" + index);
                }
            }

            while (index < arr.length) {
                arr[index++] = 0;
                System.out.println("2:" + index);
            }
            System.out.println("Tolganay");
            return arr;
        }
}
