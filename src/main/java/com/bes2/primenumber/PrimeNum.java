package com.bes2.primenumber;

public class PrimeNum {
    // n-1 까지 나눠보는 방법
    public boolean isPrimeNum1(int num) {
        for(int i=2; i<=num-1; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public boolean isPrimeNum2(int num) {
        int halfNum = num/2;
        for(int i=2; i<=halfNum; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNum pn = new PrimeNum();

        System.out.println(pn.isPrimeNum1(13));
        System.out.println(pn.isPrimeNum1(20));

        System.out.println(pn.isPrimeNum2(19));
        System.out.println(pn.isPrimeNum2(24));

        System.out.println(pn.isPrimeNum2(25));
        System.out.println(pn.isPrimeNum2(36));
    }
}
