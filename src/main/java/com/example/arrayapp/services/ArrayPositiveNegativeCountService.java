package com.example.arrayapp.services;

public class ArrayPositiveNegativeCountService {
    public int countPositive(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    public int countNegative(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }
}
