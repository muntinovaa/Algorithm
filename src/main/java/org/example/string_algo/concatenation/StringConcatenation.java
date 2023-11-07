package org.example.string_algo.concatenation;

public class StringConcatenation {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "world!";
        String concatenatedString = str1 + str2;
        System.out.println(concatenatedString); // Output: Hello, world!

        StringBuilder builder = new StringBuilder();
        builder.append(str1);
        builder.append(str2);
        String concatenatedString1 = builder.toString();
        System.out.println(concatenatedString1); // Output: Hello, world!


        String concatenatedString2 = str1.concat(str2);
        System.out.println(concatenatedString2); // Output: Hello, world!



    }

}
