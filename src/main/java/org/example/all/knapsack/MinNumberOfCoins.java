package org.example.all.knapsack;

public class MinNumberOfCoins {

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25};
        System.out.println("Minimum coins required is " + minNumberOfCoins(coins, 68)); // Should be 7
        System.out.println("Minimum coins required is " + minNumberOfCoins(coins, 30)); // Should be 2
        System.out.println("Minimum coins required is " + minNumberOfCoins(coins, 87)); // Should be 6
        System.out.println("Minimum coins required is " + minNumberOfCoins(coins, 98)); // Should be 8
    }
    public static int minNumberOfCoins(int[] coins, int v) {
        // Create a memoization table to store results of subproblems
        int[] table = new int[v + 1];

        // Base case (If given value v is 0)
        table[0] = 0;

        // Initialize all table values as infinite
        for (int i = 1; i <= v; i++)
            table[i] = Integer.MAX_VALUE;

        // Compute minimum coins required for all
        // values from 1 to v
        for (int i = 1; i <= v; i++) {
            // Go through all coins smaller than i
            for (int coin : coins) {
                if (coin <= i) {
                    int sub_res = table[i - coin];
                    // Check for INT_MAX to avoid overflow and see if
                    // result can be minimized
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                }
            }
        }

        // If table[v] is still infinite, then no solution exists
        return (table[v] == Integer.MAX_VALUE) ? -1 : table[v];
    }



}
