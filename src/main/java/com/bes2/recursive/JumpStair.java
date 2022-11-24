package com.bes2.recursive;

import java.util.Scanner;

public class JumpStair {

    public static int jump(int n) {
        if(n == 1) {
            return n;
        }else if(n == 2) {
            return jump(n-1) + 1;
        }else if(n == 3) {
            return jump(n-1) + jump(n-2) + 1;
        }

        return jump(n-3) + jump(n-2) + jump(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(jump(n));
    }
}
