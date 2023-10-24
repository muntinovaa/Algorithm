package org.example.all.StringAlgorithm;

//Count Number of Sentences:
//Given a paragraph, count the number of sentences. (Assume that a sentence ends with a period, exclamation mark, or a question mark).
public class SentenceCounter {
    public static void main(String[] args) {
        String paragraph = "This is the first sentence. Is this the second one? Yes, it is! And so on...";
        int count = countSentences(paragraph);
        System.out.println("Number of sentences: " + count);  // Output: "Number of sentences: 4"
    }

    public static int countSentences(String paragraph) {
        if (paragraph == null || paragraph.isEmpty()) {
            return 0;
        }

        String[] sentences = paragraph.split("[.!?]");
        return sentences.length;
    }
}
