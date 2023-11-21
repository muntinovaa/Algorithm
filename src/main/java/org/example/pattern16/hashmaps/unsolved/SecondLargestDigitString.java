package org.example.pattern16.hashmaps.unsolved;

import java.util.HashMap;
import java.util.Map;

/**
 https://leetcode.com/problems/second-largest-digit-in-a-string/description/
 * */
public class SecondLargestDigitString {
    public static void main(String[] args) {
        System.out.println(secondLargestDigit("hufdh4b5dvfd56n8"));
    }
    public static int secondLargestDigit(String s) {
        Map<Character, Boolean> digitMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digitMap.put(c, true);
            }
        }

        int largest = -1, secondLargest = -1;

        for (char c : digitMap.keySet()) {
            int digit = c - '0';
            System.out.println(digit);
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return secondLargest;
    }
}
