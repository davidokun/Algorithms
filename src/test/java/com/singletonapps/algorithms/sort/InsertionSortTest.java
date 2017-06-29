package com.singletonapps.algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    int[] myArray = {20, 35, -15, 7, 55, 1, -22};

    @Test
    public void insertionSort() {
        InsertionSort.insertionSort(myArray);

        assertEquals(20, myArray[4]);
        assertEquals(-15, myArray[1]);
        assertEquals(55, myArray[6]);
    }
}