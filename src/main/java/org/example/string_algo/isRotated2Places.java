package org.example.string_algo;

public class isRotated2Places {
    public static void main(String[] args) {
        String a = "amazon";
        String b = "azonam";
        System.out.println(isRotated(a, b) ? 1 : 0);  // 1

        a = "geeksforgeeks";
        b = "geeksgeeksfor";
        System.out.println(isRotated(a, b) ? 1 : 0);  // 0
    }
    public static boolean isRotated(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();

        // If lengths are different, return false
        if (lenA != lenB) {
            return false;
        }

        // If length is 1 or 2, they are rotations of each other only if they are identical
        if (lenA <= 2) {
            return a.equals(b);
        }

        // Check for 2 places left rotation and 2 places right rotation
        return (a.substring(2).equals(b.substring(0, lenB - 2)) && a.substring(0, 2).equals(b.substring(lenB - 2)))
                || (a.substring(0, lenA - 2).equals(b.substring(2)) && a.substring(lenA - 2).equals(b.substring(0, 2)));
    }


}
