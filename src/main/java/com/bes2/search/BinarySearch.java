package com.bes2.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int lowIdx = 0;
        int highIdx = 10;
        int midIdx = (lowIdx+highIdx)/2;
        int target = 7;

        if(target > nums[midIdx]){
            lowIdx = midIdx;
            midIdx = (lowIdx+highIdx)/2;
        } else if (target < nums[midIdx]) {
            highIdx = midIdx;
            midIdx = (lowIdx+highIdx)/2;
        }else {
            System.out.println("``");
        }

    }
}
