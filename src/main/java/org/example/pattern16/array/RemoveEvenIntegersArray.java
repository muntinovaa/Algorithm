package org.example.pattern16.array;

import java.util.Arrays;

public class RemoveEvenIntegersArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        for (int j : arr1) {
            System.out.print(j + " , "); // print array
        }
        System.out.println();
        int[] newArr1 =  removeEven(arr1); // calling removeEven
        for (int j : newArr1) {
            System.out.print(j + "  , "); // print array
        }

    }
    public static int[] removeEven(int[] arr) {
        int oddElements = 0;
        for (int num : arr) {
            if (num % 2 != 0) oddElements++;
        }
        int[] result = new int[oddElements];
        int result_index = 0;
        for (int num : arr) {
            if (num % 2 != 0)
                result[result_index++] = num;
        }
        return result;
    }

}
