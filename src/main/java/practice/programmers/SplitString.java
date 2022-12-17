package practice.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitString {

    public int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);
        int count = 0; int diff = 0;

        for(int i=0; i<s.length(); i++) {
            if(count == diff) {
                answer++;
                first = s.charAt(i);
            }
            if (first == s.charAt(i)) {
                count++;
            }else {
                diff++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s1 = "banana";
        String s2 = "abracadabra";
        String s3 = "aaabbaccccabba";

        SplitString ss = new SplitString();
        System.out.println(ss.solution(s1));
        System.out.println(ss.solution(s2));
        System.out.println(ss.solution(s3));
    }
}
