package com.bes2.isdividingarray;

import java.util.List;

public class isDividingArr {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = null;
        int[] answer = {};

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }

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
        try{
            System.out.println(ida.solution(arr, divisor));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
