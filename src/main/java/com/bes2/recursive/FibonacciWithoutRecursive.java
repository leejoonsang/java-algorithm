package com.bes2.recursive;

import java.util.Arrays;

public class FibonacciWithoutRecursive {
    public static long[] solution() {
        long[] arr = new long[50];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i<arr.length; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution()));
    }
}
