package org.example.string_algo.remove;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String input = " Hello World ";
        System.out.println(removeWhitespace(input));  // HelloWorld
        System.out.println(removeWhitespace1(input));  // Hello World

    }
    public static String removeWhitespace1(String str) {
        return str.trim();
    }
    public static String removeWhitespace(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }



}


/*


        2. **Check Palindrome**
        Check if a given string is a palindrome.

        3. **String Compression**
        Compress a string such that "AAABBBCC" becomes "A3B3C2".




        7. **Count Vowels**
        Count the number of vowels in a string.

        8. **Count Words**
        Count the number of words in a given sentence.


        10. **Longest Substring without Repeating Characters**
        Find the longest substring without repeating characters.



        13. **Check for Substring**
        Check if a string contains another string.

        14. **Concatenate Without Using `+`**
        Concatenate two strings without using `+`.

        15. **Convert to Integer**
        Convert a string representation of an integer to an actual integer without using `parseInt()`.

        16. **String to Date**
        Convert a string representation of a date ("MM/dd/yyyy") to a `Date` object.

        17. **Reverse Words**
        Reverse the words in a sentence.

        18. **Lexicographically smallest and largest substring**
        Find the lexicographically smallest and largest substrings of length `k`.

        19. **Balanced Parentheses**
        Check if the string has balanced parentheses.

        20. **Repeated Substring Pattern**
        Check if the string can be formed by repeating a substring.

        21. **Remove Characters**
        Remove given characters from a string.

        22. **Longest Palindromic Substring**
        Find the longest palindromic substring in a given string.

        23. **Longest Common Prefix**
        Find the longest common prefix among an array of strings.

        24. **Valid Number**
        Check if a given string is a valid number (integer or floating-point).

        25. **Zigzag Conversion**
        Convert a string into a zigzag pattern on a given number of rows.

        26. **Word Break**
        Determine if the input string can be segmented into a space-separated sequence of dictionary words.

        27. **Multiply Strings**
        Given two non-negative integers represented as strings, return their product as a string.

        28. **Valid Palindrome with Ignore**
        Check if a string is a palindrome considering only alphanumeric characters and ignoring others.

        29. **Decode Ways**
        Given a string containing digits from `2-9`, return the number of ways to decode it.

        30. **Group Anagrams**
        Given an array of strings, group anagrams together.

        31. **Compare Version Numbers**
        Compare two version numbers represented as strings.

        32. **Shortest Palindrome**
        Find the shortest palindrome in a string.

        33. **String Interleaving**
        Check if a string is the interleaving of two other strings.

        34. **String to Integer (atoi)**
        Implement the `atoi` function which converts a string to an integer.

        35. **Text Justification**
        Justify text such that each line has exactly a specified width.

        36. **Wildcard Matching**
        Implement wildcard pattern matching with support for `?` and `*`.

        37. **Count Say Sequence**
        Read off the digits of the number and group by the same digits.

        38. **Valid IP Addresses**
        Write a method to find all the valid IP addresses from a given string.

        39. **Minimum Window Substring**
        Find the minimum window in the source string that contains all characters of the target string.

        40. **Minimum Edit Distance**
        Compute the minimum number of edits (insertions, deletions, substitutions) required to change one string into another.

        41. **String Addition**
        Add two numbers represented as strings.

        42. **String Abbreviations**
        Generate all possible abbreviations of a given string.

        43. **Valid Word Abbreviation**
        Determine if a given abbreviation is valid for a word.

        44. **Reorganize String**
        Reorganize the string such that no two adjacent characters are the same.

        45. **Partition Labels**
        Partition a string into as many parts as possible so that each letter appears in at most one part.

        46. **Find All Anagrams in a String**
        Find all starting indices of the anagrams of a pattern in a text.

        47. **Longest Repeating Character Replacement**
        Given a string, replace at most `k` characters to get the longest repeating character sequence.

        48. **Encode and Decode Strings**
        Design an algorithm to encode a list of strings to a string and decode a string back to the list of strings.

        49. **String Matching in an Array**
        Return the words from the array that can be formed as a substring of another word in any location in the array.

        50. **Palindrome Pairs**
        Given a list of unique words, find all pairs of distinct indices `(i, j)` in the list such that the concatenation of the two words is a palindrome.

        These questions span a broad range of difficulty levels and address many common topics regarding string manipulation in Java.
        */
