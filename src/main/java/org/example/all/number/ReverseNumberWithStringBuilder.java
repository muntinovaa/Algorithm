package org.example.all.number;

public class ReverseNumberWithStringBuilder {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = reverseNumber(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversed);  // Outputs: 54321
    }

    public static int reverseNumber(int number) {
        String numStr = Integer.toString(number);
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        return Integer.parseInt(reversedStr);
    }

}
