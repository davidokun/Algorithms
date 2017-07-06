package com.singletonapps.algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuickSortTest {


    @Test
    public void should_Sort_An_Array() {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        int[] sortedArray = {-22, -15, 1, 7, 20, 35, 55};

        QuickSort.quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            assertEquals(sortedArray[i], intArray[i]);
        }

    }

    @Test
    public void should_Use_20_As_Pivot() {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        int pivotIndex = QuickSort.partition(intArray, 0, intArray.length);

        assertEquals(4, pivotIndex);

    }

}