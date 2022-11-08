package com.bes2.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int lowIdx = 0;
        int highIdx = nums.length-1;
        int target = 7; int targetIdx = -1;

        while(lowIdx <= highIdx) {
            int midIdx = (lowIdx + highIdx) / 2;
            int midVal = nums[midIdx];
            if(midVal > target){
                highIdx = midIdx - 1;
            } else if (midVal < target) {
                lowIdx = midIdx + 1;
            }else {
                System.out.println(midIdx);
                targetIdx = midIdx;
                break;
            }
        }


    }
}
