package com.bes2.bruteforce;

import java.util.Arrays;

public class PrepareTest {
    public int[] solution(int[] answers) {
        int[] answer = {0, 0, 0};
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2 ,2, 4, 4, 5, 5};

        for(int i=0; i<answers.length; i++){
            if(student1[i%answers.length] == answers[i]){
                answer[0]++;
            }
        }
        for(int i=0; i<answers.length; i++){
            if(student2[i%answers.length] == answers[i]){
                answer[1]++;
            }
        }
        for(int i=0; i<answers.length; i++){
            if(student3[i%answers.length] == answers[i]){
                answer[2]++;
            }
        }

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
