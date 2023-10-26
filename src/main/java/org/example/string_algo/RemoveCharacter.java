package org.example.string_algo;

public class RemoveCharacter {

    public static void main(String[] args) {
        String string1 = "computer";
        String string2 = "cat";
        System.out.println(removeChars(string1, string2)); // Expected Output: "ompuer"

        string1 = "occurrence";
        string2 = "car";
        System.out.println(removeChars(string1, string2)); // Expected Output: "ouene"
    }
    public static String removeChars(String string1, String string2) {
        // Create an array to store the presence of characters in string2
        boolean[] charSet = new boolean[26];

        for (int i = 0; i < string2.length(); i++) {
            charSet[string2.charAt(i) - 'a'] = true;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string1.length(); i++) {
            if (!charSet[string1.charAt(i) - 'a']) {
                result.append(string1.charAt(i));
            }
        }

        return result.toString();
    }


}