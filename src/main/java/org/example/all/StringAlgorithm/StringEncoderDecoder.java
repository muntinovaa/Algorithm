package org.example.all.StringAlgorithm;

import java.util.ArrayList;
import java.util.List;
/*
public class StringEncoderDecoder {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int sharpIndex = s.indexOf('#', i); // find the next '#' character
            int len = Integer.valueOf(s.substring(i, sharpIndex));
            res.add(s.substring(sharpIndex + 1, sharpIndex + 1 + len));
            i = sharpIndex + 1 + len;
        }
        return res;
    }

    public static void main(String[] args) {
        StringEncoderDecoder sed = new StringEncoderDecoder();


        String encoded = sed.encode(testList);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = sed.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
*/