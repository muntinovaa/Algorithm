package org.example.string_algo;

public class UncommonCharacters {
    public static void main(String[] args) {
        String A1 = "geeksforgeeks", B1 = "geeksquiz";
        System.out.println(UncommonChars(A1, B1)); // Expected Output: fioqruz

        String A2 = "characters", B2 = "alphabets";
        System.out.println(UncommonChars(A2, B2)); // Expected Output: bclpr
    }
    public static String UncommonChars(String A, String B) {
        // Use boolean arrays to store presence of characters in A and B
        boolean[] presentInA = new boolean[256];
        boolean[] presentInB = new boolean[256];

        // Mark presence of characters in A
        for (int i = 0; i < A.length(); i++) {
            presentInA[A.charAt(i)] = true;
        }

        // Mark presence of characters in B
        for (int i = 0; i < B.length(); i++) {
            presentInB[B.charAt(i)] = true;
        }

        StringBuilder result = new StringBuilder();

        // Check uncommon characters and append to result
        for (char c = 'a'; c <= 'z'; c++) {
            if (presentInA[c] && !presentInB[c] || !presentInA[c] && presentInB[c]) {
                result.append(c);
            }
        }

        // If result is empty, return -1
        if (result.length() == 0) {
            return "-1";
        }

        return result.toString();
    }


}
