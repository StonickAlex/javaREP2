package com.example.arrayapp.service;

import java.util.Arrays;

public class ArraySortingService {
    private static final Logger logger = LogManager.getLogger(ArraySorter.class);
    public static void bubbleSort(int[] array) {
        logger.info("Sorting array using bubble sort...");
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        logger.info("Array sorted successfully: " + Arrays.toString(array));
    }


    public static void bubbleSort(int[] array) {
        logger.info("Sorting array using bubble sort...");
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        logger.info("Array sorted successfully: " + Arrays.toString(array));
    }


    public void insertionSort(int[] array) {
        logger.info("Starting insertion sort...");
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        } logger.info("Insertion sort completed.");
    }

}
