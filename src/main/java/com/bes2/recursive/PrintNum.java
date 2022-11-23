package com.bes2.recursive;

import java.util.Scanner;

public class PrintNum {
    public static void printNum(int[] arr, int n, int idx) {
        if(arr.length == n) {
            return;
        }
        System.out.print(idx+1 + " ");
        printNum(arr, n+1, idx+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        printNum(arr, 0, 0);
    }
}
