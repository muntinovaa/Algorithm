package org.example.all.StringAlgorithm;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Auto"));
        System.out.println(reverseString1("Auto"));
    }

    static String reverseString(String str){
        String responseString="";
        char[] chars = str.toCharArray();
        for(int i=chars.length-1; i>=0; i--){
            responseString =responseString + chars[i];
        }
        return responseString;

    }

    static String reverseString1(String str){
        StringBuilder responseString= new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i=chars.length-1; i>=0; i--){
            responseString.append(chars[i]);
        }
        return responseString.toString();

    }
}
