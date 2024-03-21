package com.example.arrayapp.tests;

import com.example.arrayapp.services.ArraySumService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySumServiceTest {
    @Test
    public void testCalculateSum() {
        int[] array = {5, 3, 8, 1, 9};
        ArraySumService service = new ArraySumService();
        int sum = service.calculateSum(array);
        Assert.assertEquals(sum, 26);
    }
}
