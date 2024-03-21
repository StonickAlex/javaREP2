package com.example.arrayapp.tests;

import com.example.arrayapp.services.ArrayReplacementService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayReplacementServiceTest {
    @Test
    public void testReplaceElements() {
        int[] array = {5, 3, 8, 1, 9};
        ArrayReplacementService service = new ArrayReplacementService();
        service.replaceElements(array, 8, 10);
        int[] expectedArray = {5, 3, 10, 1, 9};
        Assert.assertEquals(array, expectedArray);
    }
}
