package com.bes2.recursive;

import java.util.Scanner;

public class LowestCommonAncestor {

    public static int toParent(int a, int b) {
        if(a < b) {
            return toParent(a, b/2) + 1;
        } else if (a > b) {
            return toParent(a/2, b) + 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(toParent(a, b));
    }
}
