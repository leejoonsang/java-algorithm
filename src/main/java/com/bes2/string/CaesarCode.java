package com.bes2.string;

public class CaesarCode {

    public String solution(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == ' ') {
                answer += ch;
                continue;
            }
            if(ch >= 'a' && ch <= 'z') {
                if(ch + n > 'z'){
                    answer += (char) (ch + n -26);
                }else{
                    answer += (char) (ch + n);
                }
            }else if(ch >= 'A' && ch <= 'Z') {
                if(ch + n > 'Z') {
                    answer += (char) (ch + n - 26);
                }else {
                    answer += (char) (ch + n);
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "Today is Friday";
        CaesarCode caesar = new CaesarCode();
        System.out.println(caesar.solution(s, 1));
    }
}
