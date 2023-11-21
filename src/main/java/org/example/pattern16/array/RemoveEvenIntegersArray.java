package org.example.pattern16.array;

import java.util.Arrays;

public class RemoveEvenIntegersArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        System.out.println();
        int[] newArr1 =  removeEven(arr1);  // calling removeEven
        int[] newArr2 =  removeEven1(arr1); // calling removeEven
        int[] newArr3 =  removeEven2(arr1); // calling removeEven
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(newArr1));
        System.out.println(Arrays.toString(newArr2));
        System.out.println(Arrays.toString(newArr3));
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

    public static int[] removeEven1(int[] arr) {
        return Arrays.stream(arr).filter(num -> num % 2 != 0).toArray();
    }
    public static int[] removeEven2(int[] arr) {
        int j = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                arr[j++] = num;
            }
        }
        return Arrays.copyOf(arr, j);
    }
}
