package com.bes2.primenumber;

interface StatementStrategy {
    boolean compare(int a, int b);
}

public class TemplateCallBackPrime {
    boolean isPrime(int num, StatementStrategy stmt) {
        for(int i=2; stmt.compare(i, num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallBackPrime tcp = new TemplateCallBackPrime();
        System.out.println(tcp.isPrime(17, (a, b) -> a < b));
        System.out.println(tcp.isPrime(21, (a, b) -> a < b/2));
        System.out.println(tcp.isPrime(101, (a, b) -> a * a < b));
    }
}
