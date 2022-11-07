package com.bes2.harshadnumber;

public class HarshadNum {

    public int solution(int x) {

        int each[] = new int[10000];
        int sum = 0;
        String strX = String.valueOf(x);

        for(int i=0; i<strX.length(); i++){
            each[i] = x%10;
            sum += each[i];
        }

        boolean answer = true;
        return sum;
    }

    public static void main(String[] args) {
        HarshadNum harshadNum = new HarshadNum();
        System.out.println(harshadNum.solution(687));
    }
}
