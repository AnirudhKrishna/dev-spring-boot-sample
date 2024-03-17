package com.leetcode.beginner;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 30;
        List<String> strings = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
             FizzBuzz(i,strings);
        }

        System.out.println(strings);
    }

    private static List<String> FizzBuzz(int n, List<String> FizzBuzz) {

        if (n < 15) {

             Fizz(n, FizzBuzz);

        } else {
            FizzBuz(n, FizzBuzz);
        }


        return FizzBuzz;
    }

    private static List<String> FizzBuz(int n, List<String> FizzBuzz) {
        if (n % 3 == 0 && n % 15 != 0) {
            FizzBuzz.add("Fizz");
        } else if (n % 5 == 0 && n % 15 != 0) {
            FizzBuzz.add("Buzz");
        } else if (n % 15 == 0) {
            FizzBuzz.add("FizzBuzz");
        } else {
            FizzBuzz.add(String.valueOf(n));
        }
        return FizzBuzz;
    }

    private static List<String> Fizz(int n, List<String> FizzBuzz) {
        if (n == 1 || n == 2) {
            FizzBuzz.add(String.valueOf(n));
        } else if (n % 3 == 0) {
            FizzBuzz.add("Fizz");
        } else if (n % 5 == 0) {
            FizzBuzz.add("Buzz");
        } else {
            FizzBuzz.add(String.valueOf(n));
        }
        return FizzBuzz;
    }
}
