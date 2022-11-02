package com.bes2.primenumber;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumSieve {

    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;

        for(int i=2; i<=50; i++) {
            list.add(i);
        }
        answer = list.size();

        for(int i=0; i<list.size(); i++) {
            if(list.get(i) % 2 == 0 && list.get(i) > 2) {
                list.remove(i);
            }
        }
        answer = list.size();
        return answer;
    }

    public static void main(String[] args) {
        PrimeNumSieve pns = new PrimeNumSieve();
        System.out.println(pns.solution(50));
    }

}
