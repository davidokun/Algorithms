package com.singletonapps.algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShellSortTest {

    @Test
    public void shouldSortArrayOfTwoElements() {

        int[] intArray = {60, 2};

        ShellSort.shellSort(intArray);

        assertEquals(2, intArray[0]);
        assertEquals(60, intArray[1]);

    }

    @Test
    public void shouldSortArrayOfTenElements() {

        int[] intArray = {60, 2, -3, 100, 8, 0, -47, 60, -1, 20};
        int[] intSortedArray = {-47, -3, -1, 0, 2, 8, 20, 60, 60, 100};

        ShellSort.shellSort(intArray);

        for (int i = 0; i < intSortedArray.length; i++) {
            assertEquals(intSortedArray[i], intArray[i]);
        }
    }
}