package com.bes2.sort;

import java.util.Arrays;

public class QuickSortWithArray {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        int pivot = arr[arr.length / 2];
        int leftIdx = 0;
        int rightIdx = arr.length - 1;

        while(arr[leftIdx] < pivot) {
            leftIdx++;
        }
        while(arr[rightIdx] > pivot) {
            rightIdx--;
        }
        if(arr[leftIdx] > arr[rightIdx]) {
            int temp = arr[leftIdx];
            arr[leftIdx] = arr[rightIdx];
            arr[rightIdx] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
