package org.example.string_algo.count;

public class SumInString {
    public static void main(String[] args) {
        String str1 = "1abc23";
        System.out.println(findSum(str1)); // Expected Output: 24

        String str2 = "geeks4geeks";
        System.out.println(findSum(str2)); // Expected Output: 4
    }
    public static int findSum(String str) {
        int sum = 0;
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the current character is a digit, extract and compute the number
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else {
                // If the current character is not a digit, add the number formed till now to the sum
                sum += num;
                num = 0;
            }
        }

        // Adding the last number, if the string ends with a number
        sum += num;

        return sum;
    }


}
