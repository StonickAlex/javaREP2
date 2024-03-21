package com.example.arrayapp.services;

public class ArraySumService {
    public int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}

