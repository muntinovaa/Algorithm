package org.example.string_algo;

public class CountVowels {
    public static void main(String[] args) {
        String input = "Hello, how many vowels are in this string?";
        System.out.println("Number of vowels: " + countVowels(input));
    }
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }


}
