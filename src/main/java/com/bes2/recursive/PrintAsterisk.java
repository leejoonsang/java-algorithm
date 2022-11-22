package com.bes2.recursive;

import java.util.Scanner;

public class PrintAsterisk {

    public static void printAsterisk(int n) {
        if(n <= 0) {
            return;
        }
        System.out.print("*");
        printAsterisk(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAsterisk(n);
    }
}
