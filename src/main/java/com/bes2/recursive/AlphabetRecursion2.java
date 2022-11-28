package com.bes2.recursive;

public class AlphabetRecursion2 {
    public static void printAlphabet(char c, String prefix) {
        if(c > 'Z') {
            return;
        }
        System.out.println(prefix + c);
        printAlphabet((char) (c+1), prefix);
    }

    public static void main(String[] args) {
        printAlphabet('A', "AA");
    }
}
