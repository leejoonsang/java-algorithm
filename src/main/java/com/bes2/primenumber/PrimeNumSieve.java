package com.bes2.primenumber;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumSieve {

    public int solution(int n) {
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

    public static void main(String[] args) {
        PrimeNumSieve pns = new PrimeNumSieve();
        System.out.println(pns.solution(400000));
    }

}
