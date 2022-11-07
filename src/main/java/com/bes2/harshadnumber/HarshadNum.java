package com.bes2.harshadnumber;

public class HarshadNum {

    public boolean solution(int x) {
        int sum = 0;
        int originalX = x;

        while(x > 0){
            sum += x%10;
            x /= 10;
        }

        return (originalX % sum) == 0;
    }

    public static void main(String[] args) {
        HarshadNum harshadNum = new HarshadNum();
        System.out.println(harshadNum.solution(687));
    }
}
