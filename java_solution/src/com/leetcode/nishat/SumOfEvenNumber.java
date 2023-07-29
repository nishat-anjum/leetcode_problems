package com.leetcode.nishat;

public class SumOfEvenNumber {
    public static void main (String arg[]) {
         int sum = 0, i = 0;
         for ( ; i <= 50 ; i = i+2 ) {
             System.out.println("Number " + i);
                 sum = sum + i;
         }
         System.out.println("Summation: " + sum);
    }

    public void printArray(int[] nums1) {
        for (int i : nums1) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
