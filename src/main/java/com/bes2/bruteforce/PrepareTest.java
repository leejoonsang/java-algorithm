package com.bes2.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrepareTest {
    public int[] solution(int[] answers) {
        int[] temp = {0, 0, 0};
        List<Integer> answer = new ArrayList<>();
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2 ,2, 4, 4, 5, 5};

        for(int i=0; i<answers.length; i++){
            if(student1[i%answers.length] == answers[i]){
                temp[0]++;
            }
        }
        for(int i=0; i<answers.length; i++){
            if(student2[i%answers.length] == answers[i]){
                temp[1]++;
            }
        }
        for(int i=0; i<answers.length; i++){
            if(student3[i%answers.length] == answers[i]){
                temp[2]++;
            }
        }

        int maxScore = 0;
        for(int j=0; j<temp.length; j++){
            if(temp[j] > maxScore){
                maxScore = temp[j];
            }
        }

        for(int j=0; j<temp.length; j++){
            if(temp[j] == maxScore){
                answer.add(temp[j]);
            }
        }

        answer.toArray(new String[answer.size()]);

        return answer;
    }

    public static void main(String[] args) {
        int[] answers1 = {1, 2, 3, 4, 5};
        int[] answers2 = {1, 3, 2, 4, 2};
        PrepareTest prepareTest = new PrepareTest();
        System.out.println(Arrays.toString(prepareTest.solution(answers1)));
        System.out.println(Arrays.toString(prepareTest.solution(answers2)));
    }
}
