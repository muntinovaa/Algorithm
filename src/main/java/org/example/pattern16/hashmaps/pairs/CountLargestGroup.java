package org.example.pattern16.hashmaps.pairs;

import java.util.HashMap;
import java.util.Map;

//1399. Count Largest Group
/*You are given an integer n.
Each number from 1 to n is grouped according to the sum of its digits.
Return the number of groups that have the largest size.
Example 1:    Input: n = 13
Output: 4
 Explanation: There are 9 groups in total,
 they are grouped according sum of its digits of numbers from 1 to 13:
[1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9].
There are 4 groups with largest size.
Example 2:
Input: n = 2
Output: 2
 Explanation: There are 2 groups [1], [2] of size 1.

 */
public class CountLargestGroup {
    public static void main(String[] args) {
        System.out.println(countLargestGroup(13)); // Output: 4
        System.out.println(countLargestGroup(2));  // Output: 2
        System.out.println(countLargestGroup1(13)); // Output: 4
        System.out.println(countLargestGroup1(2));  // Output: 2
    }

    public static int countLargestGroup(int n) {
        Map<Integer, Integer> sumFrequencyMap = new HashMap<>();
        int maxSize = 0, maxCount = 0;

        for (int i = 1; i <= n; i++) {
            int sumOfDigits = sumDigits(i);
            sumFrequencyMap.put(sumOfDigits, sumFrequencyMap.getOrDefault(sumOfDigits, 0) + 1);
            maxSize = Math.max(maxSize, sumFrequencyMap.get(sumOfDigits));
        }

        for (int count : sumFrequencyMap.values()) {
            if (count == maxSize) {
                maxCount++;
            }
        }

        return maxCount;
    }
    public static int countLargestGroup1(int n) {
        int[] freq = new int[37];
        int max = 1;
        int curr = 1;

        while(curr < 10 && curr <= n){
            freq[curr++]++;
        }

        int sum;
        int i = 0;

        while(curr <= n){
            sum = sumDigits(curr);
            i = 0;
            while(i < 10 && curr <= n){
                freq[sum]++;
                if(freq[sum] > max)
                    max = freq[sum];
                sum++; i++; curr++;
            }

        }

        int countMax = 0;

        for(int fr : freq){
            if(fr == max) countMax++;
        }

        return countMax;
    }
    private static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
