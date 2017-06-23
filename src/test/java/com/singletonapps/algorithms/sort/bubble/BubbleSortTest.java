package com.singletonapps.algorithms.sort.bubble;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {

    private int[] myArray = {22, -15, 7, 1, 55, 35, 3, -43};


    @Test
    public void shouldSwapElementsInTheArray() {
        BubbleSort.swap(myArray, 2, 3);

        assertEquals(1, myArray[2]);
        assertEquals(7, myArray[3]);
    }

    @Test
    public void shouldOrderArray() {
        BubbleSort.bubbleSort(myArray);

        assertEquals(-43, myArray[0]);
        assertEquals(-15, myArray[1]);
        assertEquals(1, myArray[2]);
        assertEquals(3, myArray[3]);
        assertEquals(7, myArray[4]);
        assertEquals(22, myArray[5]);
        assertEquals(35, myArray[6]);
        assertEquals(55, myArray[7]);
    }
}