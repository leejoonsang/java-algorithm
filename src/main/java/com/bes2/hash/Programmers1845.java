package com.bes2.hash;

import java.util.HashSet;
import java.util.Set;

public class Programmers1845 {

    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int N = nums.length / 2;

        if(set.size() < N){
            return set.size();
        }else{
            return N;
        }

    }

    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};
        Programmers1845 p1845 = new Programmers1845();
        System.out.println(p1845.solution(nums));
    }
}
