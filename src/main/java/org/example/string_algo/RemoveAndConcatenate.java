package org.example.string_algo;

//Remove common characters and concatenate
public class RemoveAndConcatenate {
    public static void main(String[] args) {
        String s1 = "aacdb", s2 = "gafd";
        System.out.println(concatenatedString(s1, s2)); // Expected Output: cbgf

        String s3 = "abcs", s4 = "cxzca";
        System.out.println(concatenatedString(s3, s4)); // Expected Output: bsxz
    }
    public static String concatenatedString(String s1, String s2) {
        // Using two boolean arrays to mark the presence of characters in strings s1 and s2
        boolean[] presentInS1 = new boolean[256];
        boolean[] presentInS2 = new boolean[256];

        // Marking characters present in s1
        for (int i = 0; i < s1.length(); i++) {
            presentInS1[s1.charAt(i)] = true;
        }

        // Marking characters present in s2
        for (int i = 0; i < s2.length(); i++) {
            presentInS2[s2.charAt(i)] = true;
        }

        StringBuilder result = new StringBuilder();

        // Adding uncommon characters of s1 to result
        for (int i = 0; i < s1.length(); i++) {
            if (!presentInS2[s1.charAt(i)]) {
                result.append(s1.charAt(i));
            }
        }

        // Adding uncommon characters of s2 to result
        for (int i = 0; i < s2.length(); i++) {
            if (!presentInS1[s2.charAt(i)]) {
                result.append(s2.charAt(i));
            }
        }

        // If result is empty, return -1
        if (result.length() == 0) {
            return "-1";
        }

        return result.toString();
    }


}