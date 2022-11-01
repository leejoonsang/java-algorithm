package com.bes2.primenumber;

public class PrimeNum {
    public boolean isPrimeNum(int n) {

        for(int i=2; i<=n-1; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNum pn = new PrimeNum();

        System.out.println(pn.isPrimeNum(13));
        System.out.println(pn.isPrimeNum(17));
        System.out.println(pn.isPrimeNum(19));
        System.out.println(pn.isPrimeNum(23));
    }
}
