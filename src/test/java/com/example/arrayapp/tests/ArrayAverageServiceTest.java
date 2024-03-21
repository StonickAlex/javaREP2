package com.example.arrayapp.tests;

import com.example.arrayapp.services.ArrayAverageService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayAverageServiceTest {
    @Test
    public void testCalculateAverage() {
        int[] array = {5, 3, 8, 1, 9};
        ArrayAverageService service = new ArrayAverageService();
        double average = service.calculateAverage(array);
        Assert.assertEquals(average, 5.2);
    }
}
