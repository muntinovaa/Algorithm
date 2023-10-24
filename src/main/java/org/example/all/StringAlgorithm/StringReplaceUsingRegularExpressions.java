package org.example.all.StringAlgorithm;

/**
 Using Java 8, write a program that replaces all occurrences of the word "sams" with "walmart" in a given string.
 The replacement should be case-insensitive.
 Given the string:
 S = "sams abbdd SAM dd sam.. jj ..sam be"
 The output should be:
 "walmart abbdd walmart dd walmart.. jj ..walmart be"
 (?i): This flag ensures the regex matching is case-insensitive.
 sam: The substring we're looking to replace.
 */
public class StringReplaceUsingRegularExpressions {



        public static void main(String[] args) {
            String s = "sams abbdd SAM dd sam.. jj ..sam be";

            String replacedString = s.replaceAll("(?i)sam", "walmart");

            System.out.println(replacedString);
        }
}
