package org.example.all.StringAlgorithm;

/**
 Problem Statement: Merge two strings by interleaving their characters.
 Input:  String 1: "abc", String 2: "def"
 Output: Merged String: "adbecf"
 Description:
 Given two input strings,
 the goal is to merge them such that the characters from each string are interleaved.
 For the provided input strings "abc" and "def", the output should be "adbecf".
 **/
public class MergeTwoStringInterleave {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";

        System.out.println(mergeStrings(s1, s2));  // Output: adbecf
    }

    public static String mergeStrings(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            result.append(s1.charAt(i++));
            result.append(s2.charAt(j++));
        }
        // Append any remaining characters from either string
        while (i < s1.length()) {
            result.append(s1.charAt(i++));
        }
        while (j < s2.length()) {
            result.append(s2.charAt(j++));
        }

        return result.toString();
    }
}



