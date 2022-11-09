package com.bes2.sort;

import java.util.Arrays;

interface StatementStrategy{
    boolean apply(int a, int b);
}
public class SelectionSortWithInterface {

    public int[] selectionSort(int[] arr, StatementStrategy stmt) {
        int minIdx;
        int temp;

        for(int i=0; i<arr.length-1; i++) {
            minIdx = i;
            for(int j=i+1; j<arr.length; j++) {
                if(stmt.apply(arr[j], arr[minIdx])){
                    minIdx = j;
                }
            }

            temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSortWithInterface ss2 = new SelectionSortWithInterface();
        System.out.println(Arrays.toString(ss2.selectionSort(arr, (a, b) -> a < b)));
        System.out.println(Arrays.toString(ss2.selectionSort(arr, (a, b) -> a > b)));
    }

}
