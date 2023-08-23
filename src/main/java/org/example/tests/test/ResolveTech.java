package org.example.tests.test;

import java.util.Scanner;

public class ResolveTech {

/**
Arrays: Productivity Pairs

 For a given array of size N, the productivity of pair(i,j) is defined as A[i]* A[j]
 You have to find the number of such productive pairs whose values are greater than to equal to K
 and the sum of productive pairs.
 Note:
 Each pair is distinct and i!=j

 Function Description
 In the provided code snippet, implement the provided
 method using the variables to print 2 space separated integers the number of such pairs
 and the sum of their products.
 You can write your code in space below the phase "Write your logic here"

 There will be multiple test cases running sso the input and output should match exactly as provided
 The base output variable result is set to a default value of -404 which can be modified.
 Additionally you can add or remove these output variables

 Input Format
 the first line of each test case contains space separated integers, N, and K.
 Second line contains N space-sepatated integers of A[i] for i ranging from 1 to N

 Sample Input
 5 6
 5 4  3 2 1

 * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n_k = sc.nextLine();
        int N = Integer.parseInt(n_k.split("\\s")[0]);
        int K = Integer.parseInt(n_k.split("\\s")[1]);
        System.out.println(N);
        System.out.println(K);

        String line = sc.nextLine();
        String[] numberStrs = line.split(" ");

        int[] A = new int[numberStrs.length];
        for(int i = 0;i < numberStrs.length;i++) {
            A[i] = Integer.parseInt(numberStrs[i]);
        }

        productivityPairs(N,A,K);
        sc.close();

    }

    public static void productivityPairs(int N, int A[], int K){
        System.out.println(N);
        System.out.println(K);

        for (int i = 0; i<N; i++) {
            System.out.println("A[i]: " + A[i]);
        }

        int value = -404;
        int sum   = -505;

        //Pairs(i,j)  A[i]*A[j]>=6 are (5,4), (5,3), (5,2), (5,1)
       int summ=0;
       for(int i=0; i < A.length; i++){
           for(int j=i+1; j< A.length; j++){
               if(A[i]*A[j]>=6 && A[i]!=A[j]){
                   summ+=A[i]*A[j];

                   System.out.println("*: "+A[i]*A[j]);
                   System.out.println("(A[i],A[j]): " +A[i] + " , " +A[j] );
               }
           }
       }
        sum = summ ==0 ? sum : summ;
        value =K ==0 ? value : K;
        System.out.println(value + " " + sum);
    }
}
