package com.bes2.decimal2binary;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i])
                    .replace("1", "#").replace("0", " ");
            answer[i] = " ".repeat(n - answer[i].length()) + answer[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DecimalToBinary dTOb = new DecimalToBinary();
        int[] arr1 = new int[]{9, 20, 28, 18, 11};
        int[] arr2 = new int[]{30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(dTOb.solution(n, arr1, arr2)));
    }
}
