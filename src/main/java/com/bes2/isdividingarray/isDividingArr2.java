package com.bes2.isdividingarray;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class isDividingArr2 {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        int[] answer = {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if(list.size() == 0){
            return new int[]{-1};
        }

        answer = new int[list.size()];
        int index = 0;
        while(!list.isEmpty()){
            answer[index++] = list.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        isDividingArr2 ida2 = new isDividingArr2();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(ida2.solution(arr, divisor)));
    }
}
