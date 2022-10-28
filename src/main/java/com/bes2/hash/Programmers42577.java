package com.bes2.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Programmers42577 {

    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i< phone_book.length; i++){
            map.put(phone_book[i], i);
        }

        for(int i=0; i< phone_book.length; i++){
            for(int j=0; j< phone_book[i].length(); j++){
                if(map.containsKey())
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
