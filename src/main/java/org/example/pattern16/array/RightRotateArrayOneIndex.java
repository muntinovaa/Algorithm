package org.example.pattern16.array;

import java.util.Arrays;

public class RightRotateArrayOneIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rightRotateByOne(arr)));

    }

    public static int[] rightRotateByOne(int[] arr) {
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
        return arr;
    }

}
