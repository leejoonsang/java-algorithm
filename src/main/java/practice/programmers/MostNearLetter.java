package practice.programmers;

import java.util.Arrays;

public class MostNearLetter {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i=0; i<s.length(); i++) {
            answer[i] = -1;
        }

        for(int i=1; i<s.length(); i++) {
            for(int j=0; j<=i-1; j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    answer[i] = i-j;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "banana";
        MostNearLetter mnl = new MostNearLetter();
        System.out.println(Arrays.toString(mnl.solution(s)));
    }
}
