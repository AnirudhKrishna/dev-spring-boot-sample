package com.leetcode.beginner;

import java.util.Arrays;

public class RunningSum1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int size = nums.length;
        int[] sum = new int[size];

        int output = 0;
        for (int i=0;i<size;i++) {
            output = output + nums[i];
            sum[i] = output;
        }
        System.out.println( Arrays.toString(sum));
    }
}
