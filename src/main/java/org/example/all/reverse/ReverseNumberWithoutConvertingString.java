package org.example.all.reverse;

public class ReverseNumberWithoutConvertingString {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = reverseNumber(number);
        System.out.println(reversed);  // Outputs: 54321
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;           // Extract the last digit
            reversed = reversed * 10 + digit;  // Add it to the result after shifting the current result
            number /= 10;                      // Remove the last digit
        }
        return reversed;
    }

}
