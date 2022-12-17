package practice.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HallOfFame {

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<score.length; i++) {
            if (i < k-1) {
                temp.add(score[i]);
                Collections.sort(temp);
                Collections.reverse(temp);
                answer[i] = temp.get(temp.size() - 1);
            }else if(i >= k-1) {
                temp.add(score[i]);
                Collections.sort(temp);
                Collections.reverse(temp);
                answer[i] = temp.get(k - 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};

        HallOfFame hof = new HallOfFame();
        System.out.println(Arrays.toString(hof.solution(k, score)));
    }
}
