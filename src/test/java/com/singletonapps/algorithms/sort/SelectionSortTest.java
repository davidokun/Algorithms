package com.singletonapps.algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    private int[] myArray = {20, 35, -15, 7, 55, 1, -22};

    @Test
    public void shouldSortArrayWithSelectionSort() {
        SelectionSort.selectionSort(myArray);

        assertEquals(-22, myArray[0]);
        assertEquals(1, myArray[2]);
        assertEquals(20, myArray[4]);
        assertEquals(55, myArray[6]);
    }

    @Test
    public void shouldSwapElementsInTheArray() {
        SelectionSort.swap(myArray, 4, 6);

        assertEquals(-22, myArray[4]);
        assertEquals(55, myArray[6]);
    }
}