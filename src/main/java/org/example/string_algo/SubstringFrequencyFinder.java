package org.example.string_algo;

public class SubstringFrequencyFinder {
    public static void main(String[] args) {
        String inputStr = "ababcabcabab";
        String substr = "ab";
        System.out.println(findSubstringFrequency(inputStr, substr));  // Expected output: 6
    }
    public static int findSubstringFrequency(String str, String substr) {
        if (str == null || substr == null || str.length() < substr.length()) {
            return 0;
        }

        int count = 0;
        int substrLength = substr.length();

        for (int i = 0; i <= str.length() - substrLength; i++) {
            if (str.substring(i, i + substrLength).equals(substr)) {
                count++;
            }
        }

        return count;
    }



}
