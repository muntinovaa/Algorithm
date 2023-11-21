package org.example.pattern16.array;

public class SumArrayElements {
    public static void main(String[] args) {
        int[] arr = {12, 1};
        int secondLargest = sumArrayElements(arr);
        System.out.println("The second largest element is: " + secondLargest);
    }

    private static int sumArrayElements(int[] arr) {
        int sum =0;
        for (int i: arr){
            sum+=i;
        }
        return sum;
    }
}
