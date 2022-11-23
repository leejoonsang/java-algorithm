package com.bes2.recursive;

import java.util.Arrays;

public class FactorialWithoutRecursive {
    public static void main(String[] args) {
        long[] arr = new long[50];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i<arr.length; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
