package com.bes2.isdividingarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class isDividingArr {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);

        answer = new int[list.size()];
        for(int i=0; i< answer.length; i++){
            answer[i] = list.get(i);
        }

        if(answer.length == 0){
            return new int[]{-1};
        }

        return answer;
    }

    public static void main(String[] args) {
        isDividingArr ida = new isDividingArr();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(ida.solution(arr, divisor)));

    }
}
