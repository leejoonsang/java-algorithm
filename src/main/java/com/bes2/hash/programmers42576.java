package com.bes2.hash;

import java.util.HashMap;

public class programmers42576 {
    public String solution(String[] participant, String[] completion){
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0)+1);
        }

        for(String player : completion){
            map.put(player, map.get(player));
        }

        return answer;
    }
}
