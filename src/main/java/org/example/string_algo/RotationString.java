package org.example.string_algo;

public class RotationString {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(areRotations(s1, s2));  // true

        s1 = "abcd";
        s2 = "bacd";
        System.out.println(areRotations(s1, s2));  // false
    }

     //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        if(s1.length()!=s2.length()){
            return false;
        }else{
            String concat=s1+s1;
            return concat.contains(s2);
        }
    }
}
