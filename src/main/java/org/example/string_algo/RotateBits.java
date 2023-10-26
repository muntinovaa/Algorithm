package org.example.string_algo;

public class RotateBits {
    public static void main(String[] args) {
        int N = 28, D = 2;
        int[] res = rotate(N, D);
        System.out.println("Left Rotation: " + res[0]);  // Expected Output: 112
        System.out.println("Right Rotation: " + res[1]); // Expected Output: 7
    }
    static int[] rotate(int N, int D) {
        int mask;
        int size = 16;

        // Rotating left
        mask = (N >> (size - D)) & ((1 << D) - 1);
        int leftRotate = (N << D) | mask;

        // Making sure only 16 bits are considered after rotation
        leftRotate = leftRotate & ((1 << size) - 1);

        // Rotating right
        mask = N & ((1 << D) - 1);
        int rightRotate = (mask << (size - D)) | (N >> D);

        int[] result = new int[2];
        result[0] = leftRotate;
        result[1] = rightRotate;

        return result;
    }


}
