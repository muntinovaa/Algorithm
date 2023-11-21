package org.example.all.math;

public class FibonacciNumber {
    public static void main(String[] args) {
        // We'll test the function for the first 10 Fibonacci numbers
        for (int i = 0; i <= 10; i++) {
            System.out.println("fibonacciIterative(" + i + ") = " + fibonacciIterative(i));
        }
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }

}
