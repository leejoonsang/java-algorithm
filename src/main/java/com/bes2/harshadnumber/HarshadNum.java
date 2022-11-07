package com.bes2.harshadnumber;

public class HarshadNum {

    public boolean solution(int x) throws Exception {
        boolean answer = true;
        int sum = 0;

        while(x > 0){
            sum += x%10;
            x /= 10;
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        HarshadNum harshadNum = new HarshadNum();
        System.out.println(harshadNum.solution(687));
    }
}
