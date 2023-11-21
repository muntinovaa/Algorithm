package org.example.pattern16.array.minmax;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {12, 1,2 };
        int[] arr2 = {12, 1,2,3};
        int[] commonElements = commonElementsBetweenTwoArrays(arr1, arr2);
        for (int i : commonElements){
            System.out.println(i);
        }
    }

    private static int[] commonElementsBetweenTwoArrays(int[] arr1,int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        Set<Integer> common = new HashSet<>();
        for (int num : arr2) {
            if (set.contains(num)) {
                common.add(num);
            }
        }

        int[] commonArray = new int[common.size()];
        int index = 0;
        for (Integer num : common) {
            commonArray[index++] = num;
        }
        return commonArray;
      //return common.stream().mapToInt(Integer::intValue).toArray();
    }
}
