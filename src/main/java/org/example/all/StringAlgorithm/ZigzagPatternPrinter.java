package org.example.all.StringAlgorithm;

public class ZigzagPatternPrinter {
    public static void main(String[] args) {
        String sentence = "This is a test sentence for the zigzag pattern";
        printZigzag(sentence);
    }

    public static void printZigzag(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        int start = 0;
        int end = words.length - 1;

        // Use two pointers: 'start' for the beginning and 'end' for the end
        while (start <= end) {
            System.out.println(words[start]);
            if (start != end) {  // To prevent printing twice for the middle word
                System.out.println(words[end]);
            }

            start++;
            end--;
        }
    }
}
