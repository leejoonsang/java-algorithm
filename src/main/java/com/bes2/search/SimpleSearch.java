package com.bes2.search;

import java.util.Scanner;

public class SimpleSearch {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] data = new int[n];

            for(int i=0; i<n; i++) {
                data[i] = sc.nextInt();
            }
            int target = sc.nextInt();

            for(int i=0; i<data.length; i++) {
                if(target == data[i]){
                    System.out.println(i+1);
                    break;
                }
            }

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
