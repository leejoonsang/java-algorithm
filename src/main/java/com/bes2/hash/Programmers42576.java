package com.bes2.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Programmers42576 {
    public String solution(String[] participant, String[] completion){
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0)+1);
        }

        for(String player : completion){
            map.put(player, map.get(player)-1);
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            if(entry.getValue() == 1){
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        Programmers42576 p42576 = new Programmers42576();
        System.out.println(p42576.solution(participant, completion));
    }
}
