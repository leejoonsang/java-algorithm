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
        int[] arr = new int[n+1];   // 인덱싱 어떻게?
        boolean[] check = new boolean[n+1];

        for(int i=2; i<=n; i++) {
            arr[i] = i;
            check[i] = true;
        }

        for(int i=2; i<=n; i++){
            if(arr[i] % 2 == 0 && arr[i] > 2) {
                check[i] = false;
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
