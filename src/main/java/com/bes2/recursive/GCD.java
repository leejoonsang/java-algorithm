package com.bes2.recursive;

import java.util.Scanner;

public class GCD {
    public static int getGcd(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }else {
            return getGcd(num2, num1%num2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = getGcd(num1, num2);

        System.out.println(gcd);
    }
}
