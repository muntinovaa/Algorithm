package org.example.all.ArrayAlgorithm;

public class MaxDistanceBetweenXY {
    public static int maxDistance(int arr[], int x, int y) {
        int n = arr.length;
        int prev = -1;
        int maxDist = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (prev != -1 && arr[i] != arr[prev]) {
                    maxDist = Math.max(maxDist, i - prev);
                }
                prev = i;
            }
        }

        return maxDist;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3};
        int x = 3;
        int y = 5;

        System.out.println("Maximum distance between " + x + " and " + y + " is: " + maxDistance(arr, x, y));
    }
}
