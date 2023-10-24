package org.example.all.ReverseString;

public class StringReverseByWord {
        public static void main(String[] args) {
            String input = "Hello World,";
            String reversed = reverseByWords(input);
            System.out.println(reversed);
        }

        public static String reverseByWords(String input) {
            String[] words = input.split("\\s+"); // split on spaces
            StringBuilder reversedString = new StringBuilder();

            for (int i = words.length - 1; i >= 0; i--) {
                reversedString.append(words[i]);
                if (i != 0) {
                    reversedString.append(" ");
                }
            }

            return reversedString.toString();
        }
}
