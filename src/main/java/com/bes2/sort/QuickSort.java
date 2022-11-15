package com.bes2.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        int pivot = arr[arr.length/2];

        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> bigger = new ArrayList<>();

        System.out.println(pivot);

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < pivot) {
                smaller.add(arr[i]);
            } else if (arr[i] > pivot) {
                bigger.add(arr[i]);
            }else equal.add(arr[i]);
        }

        System.out.println(smaller);
        System.out.println(equal);
        System.out.println(bigger);
    }
}
