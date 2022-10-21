package com.bes2.bracket;

import java.util.Scanner;
import java.util.Stack;

public class SolveBracket {
    public boolean solutionA(String s){
        while(s.indexOf("()") >= 0){
            s = s.replace("()", "");
        }

        return s.length() == 0;
    }

    public boolean solutionB(String s){
        while(s.indexOf("()") >= 0){
            String[] splitted = s.split("\\(\\)");
            s = String.join("", splitted);
        }

        return s.length() == 0;
    }

    public boolean solution(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if('(' == s.charAt(i)) {
                st.push(s.charAt(i));
            } else if(')' == s.charAt(i)){
                if(st.empty()){
                    return false;
                }
                st.pop();
            }
        }
        return st.empty();
    }

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String s = sc.next();

            SolveBracket sb = new SolveBracket();
            System.out.println(sb.solutionA(s));
            System.out.println(sb.solutionB(s));
            System.out.println(sb.solution(s));

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }


    }
}