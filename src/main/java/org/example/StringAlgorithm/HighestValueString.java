package org.example.StringAlgorithm;

public class HighestValueString {
    public static int calculateValue(String str, String mapping) {
        int totalValue = 0;
        for (char c : str.toCharArray()) {
            int charValue = mapping.indexOf(c);
            if (charValue != -1) {
                totalValue += charValue + 1; // Add 1 because the mapping is 1-based
            }
        }
        return totalValue;
    }

    public static String findHighestValueString(String str1, String str2, String mapping) {
        int value1 = calculateValue(str1, mapping);
        int value2 = calculateValue(str2, mapping);

        if (value1 > value2) {
            return str1;
        } else if (value2 > value1) {
            return str2;
        } else {
            return "Equal values"; // Both strings have the same total value
        }
    }

    public static void main(String[] args) {
        String erica = "erica";
        String bob = "bob";
        String mapping = "abcdefghijklmnopqrstuvwxyz";

        String result = findHighestValueString(erica, bob, mapping);
        System.out.println("The string with the highest value is: " + result);
    }
}
