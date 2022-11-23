package com.bes2.recursive;

import java.util.Scanner;

public class SumOfDigit {
    public static long sumOfDigit(long num) {
        if(num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigit(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(sumOfDigit(num));
    }
}
