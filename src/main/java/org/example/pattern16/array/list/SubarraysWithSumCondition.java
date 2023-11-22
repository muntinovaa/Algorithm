package org.example.pattern16.array.list;

import java.util.*;

public class SubarraysWithSumCondition {
  /*  public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 5, 20, 8};
        { {1,4,5},{4,2,6},{2,6,8},{6,5,11},{5,20,25},{20,8,28}}
        List<List<Integer>> result = findSubArraysWithSum(arr);

        // Print the result
        for (List<Integer> subArray : result) {
            System.out.println(subArray);
        }
    }*/


    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 5, 20, 8};
        List<List<Integer>> result = findSubArraysWithSum(arr);
        System.out.println(result);


    }

    public static List<List<Integer>> findSubArraysWithSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list =  new ArrayList<>();

        for (int i=0; i<arr.length-1;i++){
            list.add(arr[i]);
            list.add(arr[i+1]);
            list.add(arr[i]+arr[i+1]);
        }


    /*    for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println(i);

                if (i != j) {
                    int sum = arr[i] + arr[j];
                    // Check if the sum is in the array and distinct from both elements of the pair
                    if (set.contains(sum) && sum != arr[i] && sum != arr[j]) {
                        String pairKey = arr[i] < arr[j] ? arr[i] + ":" + arr[j] : arr[j] + ":" + arr[i];
                        if (!seenPairs.contains(pairKey)) {
                            seenPairs.add(pairKey);
                            List<Integer> subArray = new ArrayList<>();
                            subArray.add(arr[i]);
                            subArray.add(arr[j]);
                            subArray.add(sum);
                            result.add(subArray);
                        }
                    }
                }
            }
        }*/

        return result;
    }
}