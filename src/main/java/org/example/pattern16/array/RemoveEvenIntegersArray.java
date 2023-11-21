package org.example.pattern16.array;

public class RemoveEvenIntegersArray {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size]; //declaration and instantiation
        System.out.print("Before removing Even Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i; // assigning values
            System.out.print(arr[i] +  " ");
        }
        System.out.println();

        int[] newArr =  removeEven(arr); // calling removeEven
        System.out.print("After removing Even Numbers: ");
        for (int j : newArr) {
            System.out.print(j + " "); // print array
        }
    }
    public static int[] removeEven(int[] arr) {
        int oddElements = 0;
        for (int j : arr) {
            if (j % 2 != 0) oddElements++;
        }
        int[] result = new int[oddElements];
        int result_index = 0;
        for (int j : arr) {
            if (j % 2 != 0)
                result[result_index++] = j;
        }
        return result;
    }

}
