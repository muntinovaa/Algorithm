package org.example.string_algo;

import java.util.Stack;

public class ParenthesisCheckerInString {
    public static void main(String[] args) {
        String exp1 = "{([])}";
        String exp2 = "()";
        String exp3 = "([]";
        System.out.println(isParenthesis(exp1));  // true
        System.out.println(isParenthesis(exp2));  // true
        System.out.println(isParenthesis(exp3));  // false
    }
   static boolean isParenthesis(String x)
    {
        Stack<Character> stack = new Stack<>();

        // Traverse through the string
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);

            // If ch is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If the stack is empty, it means there's no corresponding opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                // Check if the top of the stack has the corresponding opening bracket
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                } else if (ch == '}' && top != '{') {
                    return false;
                } else if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }
        // Return True if stack is empty, otherwise False
        return stack.isEmpty();
    }

}


