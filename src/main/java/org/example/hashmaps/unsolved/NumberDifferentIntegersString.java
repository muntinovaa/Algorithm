package org.example.hashmaps.unsolved;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 1805. Number of Different Integers in a String
 https://leetcode.com/problems/number-of-different-integers-in-a-string/
 You are given a string word that consists of digits and lowercase English letters.
 You will replace every non-digit character with a space.
 For example, "a123bc34d8ef34" will become " 123  34 8  34".
 Notice that you are left with some integers
 that are separated by at least one space: "123", "34", "8", and "34".

 Return the number of different integers after
 performing the replacement operations on word.
 Two integers are considered different if their decimal representations without any leading zeros are different.
 Example 1: Input: word = "a123bc34d8ef34"
 Output: 3
 Explanation: The three different integers are "123", "34", and "8". Notice that "34" is only counted once.
 Example 2: Input: word = "leet1234code234"
 Output: 2
 **/
public class NumberDifferentIntegersString {
    public static void main(String[] args) {
        System.out.println(numDifferentIntegers("ufhsd4sdfiodsj1"));
    }
    public static int numDifferentIntegers(String word) {
        Set<String> uniqueNumbers = new HashSet<>();
        Pattern pattern = Pattern.compile("\\d+");
        System.out.println(pattern);
        Matcher matcher = pattern.matcher(word);
        System.out.println(matcher.find());

        while (matcher.find()) {
            String num = matcher.group();
            System.out.println(num);
            String normalizedNum = num.replaceFirst("^0+(?!$)", ""); // Removes leading zeros
            uniqueNumbers.add(normalizedNum);
        }

        return uniqueNumbers.size();
    }

}
