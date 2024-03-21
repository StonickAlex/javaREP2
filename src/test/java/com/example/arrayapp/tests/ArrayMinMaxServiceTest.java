package com.example.arrayapp.tests;

import com.example.arrayapp.services.ArrayMinMaxService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayMinMaxServiceTest {
    @Test
    public void testFindMin() {
        int[] array = {5, 3, 8, 1, 9};
        ArrayMinMaxService service = new ArrayMinMaxService();
        int min = service.findMin(array);
        Assert.assertEquals(min, 1);
    }

    @Test
    public void testFindMax() {
        int[] array = {5, 3, 8, 1, 9};
        ArrayMinMaxService service = new ArrayMinMaxService();
        int max = service.findMax(array);
        Assert.assertEquals(max, 9);
    }
}
