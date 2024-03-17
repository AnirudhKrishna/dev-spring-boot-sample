package com.leetcode.beginner;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 31;
        List<String> strings = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
             fizzBuzz(i,strings);
        }

        System.out.println(strings);
    }

    private static void fizzBuzz(int n, List<String> stringList) {

        if (n < 15) {

             fizz(n, stringList);

        } else {
            fizzBuz(n, stringList);
        }


    }

    private static void fizzBuz(int n, List<String> stringList) {
        if (n % 3 == 0 && n % 15 != 0) {
            stringList.add("Fizz");
        } else if (n % 5 == 0 && n % 15 != 0) {
            stringList.add("Buzz");
        } else if (n % 15 == 0) {
            stringList.add("FizzBuzz");
        } else {
            stringList.add(String.valueOf(n));
        }
    }

    private static void fizz(int n, List<String> stringList) {
        if (n == 1 || n == 2) {
            stringList.add(String.valueOf(n));
        } else if (n % 3 == 0) {
            stringList.add("Fizz");
        } else if (n % 5 == 0) {
            stringList.add("Buzz");
        } else {
            stringList.add(String.valueOf(n));
        }
    }
}
