package com.example.arrayapp.services;

public class ArrayReplacementService {
    public void replaceElements(int[] array, int oldValue, int newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
    }
}
