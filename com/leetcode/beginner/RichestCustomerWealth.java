package com.leetcode.beginner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };

        int maxSum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = accounts[i][j] + sum;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("Richest customer is ::" + maxSum);
    }
}
