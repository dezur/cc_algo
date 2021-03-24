package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        int sum = 0;
        for (int num: numbers) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }
}