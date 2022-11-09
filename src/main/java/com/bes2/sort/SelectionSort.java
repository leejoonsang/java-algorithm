package com.bes2.sort;

import java.util.Arrays;

public class SelectionSort {

    public int[] doSelectionSort(int[] arr) {
        int minIdx;
        int temp;

        for(int i=0; i<arr.length-1; i++) {
            minIdx = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }

            temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }

    public int[] reverseSelectionSort(int arr[]) {
        int maxIdx = 0;
        int temp;

        for(int i=0; i<arr.length-1; i++) {
            maxIdx = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] > arr[maxIdx]){
                    maxIdx = j;
                }
            }

            temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;

        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.doSelectionSort(arr)));
        System.out.println(Arrays.toString(selectionSort.reverseSelectionSort(arr)));
    }
}
