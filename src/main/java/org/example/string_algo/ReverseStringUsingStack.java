package org.example.string_algo;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverse(String S) {
        // Create a stack to store characters of the string
        Stack<Character> stack = new Stack<>();

        // Push characters of S to the stack
        for (int i = 0; i < S.length(); i++) {
            stack.push(S.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();

        // Pop characters from the stack and append to the result
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String S = "GeeksforGeeks";
        System.out.println(reverse(S)); // Expected Output: skeeGrofskeeG
    }
}
