package com.bes2.recursive;

public class AlphabetRecursion {
    public static void printAlphabet(char c) {
        if(c > 'Z') {
            return ;
        }
        System.out.println(c);
        printAlphabet((char) (c+1));
    }

    public static void main(String[] args) {
        printAlphabet('A');
    }
}
