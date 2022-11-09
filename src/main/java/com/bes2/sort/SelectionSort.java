package com.bes2.sort;

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
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
    }
}
