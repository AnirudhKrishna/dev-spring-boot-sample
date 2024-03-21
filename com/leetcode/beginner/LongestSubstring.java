package com.leetcode.beginner;

import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        String input = "abcabcbb";
        Map<Integer, Character> map = new HashMap<>();
        Integer maxSubstring = 0;
        if (input.length()==0){
            System.out.println("return zero");
        }

        for (int i = 0; i < input.length(); i++) {
            Character head = input.charAt(i);
            System.out.println("Value of head ::: " + head);
            for (int j = i; j < input.length(); j++) {
                Character next = input.charAt(j);
                System.out.println("Value of next ::: " + next);
                if (!map.containsValue(next)) {
                    map.put(j, input.charAt(j));
                } else {
                    List<Character> values = new ArrayList<>(map.values());
                    Integer sizeOfSUbstring = values.size();
                    System.out.println(sizeOfSUbstring);
                    map.clear();
                    if (sizeOfSUbstring > maxSubstring) {
                        maxSubstring = sizeOfSUbstring;
                    }

                }
            }


        }
        System.out.println("maxSubstring :::::::"+ maxSubstring);
    }
}
