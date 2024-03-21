package com.example.arrayapp.services;

public class ArrayAverageService {
    public double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
