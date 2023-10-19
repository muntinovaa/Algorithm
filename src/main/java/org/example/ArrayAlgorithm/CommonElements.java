package org.example.ArrayAlgorithm;

import java.util.ArrayList;

public class CommonElements {
    static ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3)
    {
        // code here
        int i=0,j=0,k=0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(i < n1 && j < n2 && k <n3){
            if(A[i] == B[j] && B[j] == C[k]){
                if(!a.contains(A[i]))
                    a.add(A[i]);
                i++;
                j++;
                k++;
            }else if(A[i] < B[j] && A[i] < C[k]){
                i++;
            }else if(B[j] < C[k]){
                j++;
            }else{
                k++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] A = { 6, 7, 20, 80, 100};
        int[] B = { 1, 5, 10, 20, 40, 80};
        int[] C = { 3, 4, 15, 20, 30, 70, 80, 120};

        ArrayList<Integer> list = commonElements(A, B, C, A.length, B.length, C.length);
        for (Integer number: list){
            System.out.println(number);
        }




    }
}
