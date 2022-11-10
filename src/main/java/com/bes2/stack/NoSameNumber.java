package com.bes2.stack;

import java.util.Arrays;
import java.util.Stack;

public class NoSameNumber {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);

        for(int i=1; i<arr.length; i++) {
            if(st.peek() != arr[i]){
                st.push(arr[i]);
            }
        }

        int[] answer = new int[st.size()];
        for(int i=st.size()-1; i>=0; i--) {
            answer[i] = st.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,3,3,0,1,1};
        NoSameNumber nsn = new NoSameNumber();
        System.out.println(Arrays.toString(nsn.solution(arr)));
    }
}
