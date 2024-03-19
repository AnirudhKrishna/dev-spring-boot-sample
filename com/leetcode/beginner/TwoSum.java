package com.leetcode.beginner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {4, -2, 5, 0, 6, 3, 2, 7};
        int target = 1;


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    int[] output = {i, j};
                    System.out.println(Arrays.toString(output));
                }
            }

        }
    }

}

