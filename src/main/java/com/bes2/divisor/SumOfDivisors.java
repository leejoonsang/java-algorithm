package com.bes2.divisor;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDivisors {

    public static int getDivisors(int n) {
        int[] result = new int[n];
        int idx = 0; int sum = 0;
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                result[idx++] = i;
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getDivisors(n));
    }
}
