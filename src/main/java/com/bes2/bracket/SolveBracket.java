package com.bes2.bracket;

import java.util.Scanner;

public class SolveBracket {
    public boolean solution(String s){
        while(s.indexOf("()") >= 0){
            s = s.replace("()", "");
        }

        return s.length() == 0;
    }

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String s = sc.next();

            SolveBracket sb = new SolveBracket();
            System.out.println(sb.solution(s));

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }


    }
}





/*
sol A) replaceAll()
sol B) split()
 */