package com.bes2.kth;

import java.util.Arrays;

public class kthNum {
    public int[] solution(int[] arr, int[][] commands){
        int[] answer = new int[commands.length];
        int index = 0;
        for(int[] command : commands){
            int[] slicedArr = Arrays.copyOfRange(arr, command[0]-1, command[1]);
            Arrays.sort(slicedArr);
            answer[index++] = slicedArr[command[2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {1, 4, 2}};
        kthNum kthNum = new kthNum();
        System.out.println(Arrays.toString(kthNum.solution(arr, command)));
    }
}
