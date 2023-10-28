package org.example.array;
import java.util.ArrayList;
import java.util.List;

/**
 The first element is directly added to the output list.
 sum an increasing count of integers (e.g., next 2, then next 3)
 Continue this pattern until the input array is exhausted
 **/
public class SumPattern {

    public static void main(String[] args) {
        int[] input = {1, 6, 8, 5, 9, 4, 7, 2, 3, 4, 5, 6, 7};
        List<Integer> output = getSumPattern(input);
        System.out.println(output);
    }

    public static List<Integer> getSumPattern(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int count = 1;

        while (i < arr.length) {
            int sum = 0;

            // Sum 'count' integers from the array

            System.out.println("count:" +count);
            System.out.println("length:" +arr.length);
            for (int j = 0; j < count && i < arr.length; j++) {
                sum += arr[i];
                i++;
            }

            // Add the sum to the result list
            result.add(sum);
            count++; // Increase the count for next iteration
        }

        return result;
    }
}