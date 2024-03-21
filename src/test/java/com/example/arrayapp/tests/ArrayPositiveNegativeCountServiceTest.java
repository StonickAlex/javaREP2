package com.example.arrayapp.tests;

import com.example.arrayapp.services.ArrayPositiveNegativeCountService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayPositiveNegativeCountServiceTest {
    @Test
    public void testCountPositive() {
        int[] array = {5, -3, 8, -1, 9};
        ArrayPositiveNegativeCountService service = new ArrayPositiveNegativeCountService();
        int positiveCount = service.countPositive(array);
        Assert.assertEquals(positiveCount, 3);
    }

    @Test
    public void testCountNegative() {
        int[] array = {5, -3, 8, -1, 9};
        ArrayPositiveNegativeCountService service = new ArrayPositiveNegativeCountService();
        int negativeCount = service.countNegative(array);
        Assert.assertEquals(negativeCount, 2);
    }
}
