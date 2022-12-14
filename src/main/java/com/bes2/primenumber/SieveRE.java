package com.bes2.primenumber;

import java.util.Arrays;

public class SieveRE {
    public static void main(String[] args) {
        int n = 50;
        int[] arr = new int[n-1];

        for(int i=0; i<arr.length; i++) {
            arr[i] = i+2;
        }

        for(int j=2; j*j<=n; j++) {
            for(int k=0; k< arr.length; k++) {
                if(arr[k]%j==0 && arr[k]>j){
                    arr[k] = 0;
                }
            }
        }

        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                cnt ++;
            }
        }

        System.out.println(cnt);
        System.out.println(Arrays.toString(arr));

    }
}
