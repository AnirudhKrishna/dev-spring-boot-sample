package com.leetcode.beginner;

public class ReduceNumberToZero {

    public static void main(String[] args) {
        int num = 123;

        int stepCount = 0;

        while (num > 0) {

            boolean isEven = checkOddOrEven(num);
            if (isEven) {
                num = num / 2;
                stepCount++;
            } else {
                num = num - 1;
                stepCount++;
            }
        }

        System.out.println(stepCount);


    }


    private static boolean checkOddOrEven(int num) {

        return num % 2 == 0;

    }
}
