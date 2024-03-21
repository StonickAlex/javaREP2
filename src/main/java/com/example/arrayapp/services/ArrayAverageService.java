package com.example.arrayapp.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayAverageService {
    private static final Logger logger = LogManager.getLogger(ArrayAverageService.class);

    public double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            logger.warn("Received null or empty array");
            return 0;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        double average = (double) sum / array.length;
        logger.info("Calculated average: {}", average);
        return average;
    }
}
