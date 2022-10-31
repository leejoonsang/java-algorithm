package com.bes2.bruteforce;

public class PrepareTest {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] student1Answer = {1, 2, 3, 4, 5};

        for(int i=0; i<answers.length; i++){
            if(student1Answer[i%answers.length] == answers[i]){

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answers1 = {1, 2, 3, 4, 5};
        PrepareTest prepareTest = new PrepareTest();
        prepareTest.solution(answers1);
    }
}
