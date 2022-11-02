package com.bes2.primenumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumSieve {

    public int solutionTemp(int n) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;

        for(int i=2; i<=n; i++) {
            list.add(i);
        }

        for(int j=2; j*j<=n; j++){
            for(int i=0; i<list.size(); i++) {
                if(list.get(i) % j == 0 && list.get(i) > j) {
                    list.remove(i);
                }
            }
        }
        answer = list.size();

        return answer;
    }

    public boolean[] solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        boolean[] check = new boolean[n+1];

        for(int i=2; i<=n; i++) {
            arr[i] = i;
            check[i] = true;
        }

        for(int j=2; j*j<=n; j++){
            for(int k=2; k<=n; k++){
                if(arr[k] % j == 0 && arr[k] > j) {
                    check[k] = false;
                }
            }
        }

        // arr[0] ~ arr[9]
        return check;
    }

    public static void main(String[] args) {
        PrimeNumSieve pns = new PrimeNumSieve();
        System.out.println(Arrays.toString(pns.solution(10)));
    }

}
