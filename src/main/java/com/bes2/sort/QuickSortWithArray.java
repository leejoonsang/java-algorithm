package com.bes2.sort;

import java.util.Arrays;

public class QuickSortWithArray {

    public int[] sort(int[] arr, int startIdx, int endIdx) {
        int leftIdx = 0;
        int rightIdx = arr.length - 1;
        int pivot = arr[(startIdx+endIdx) / 2];

        while (leftIdx <= rightIdx) {
            while(arr[leftIdx] < pivot) {
                leftIdx++;
            }
            while(arr[rightIdx] > pivot) {
                rightIdx--;
            }
            if(leftIdx <= rightIdx){
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx++;
                rightIdx--;
            }
        }
        if(startIdx < rightIdx) sort(arr, startIdx, rightIdx);
        if(leftIdx < endIdx) sort(arr, leftIdx, endIdx);

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        System.out.println(Arrays.toString(arr));

        QuickSortWithArray qs = new QuickSortWithArray();
        qs.sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
