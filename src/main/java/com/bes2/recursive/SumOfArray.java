package com.bes2.recursive;

public class SumOfArray {

    public static int sum(int[] arr, int answer, int idx){
        if(arr.length == idx) {
            return answer;
        }
        return sum(arr, answer + arr[idx], idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 2, 9};
        System.out.println(sum(arr, 0, 0));
    }
}
