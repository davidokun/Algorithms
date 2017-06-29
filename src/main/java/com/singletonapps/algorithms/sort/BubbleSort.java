package com.singletonapps.algorithms.sort;

/**
 * Bubble Sort Algorithm
 *
 * Complexity = O(n^2) -> Quadratic -> Stable
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] myArray = {22, -15, 7, 1, 55, 35, 3, -43};

        bubbleSort(myArray);

        for (int element : myArray) {
            System.out.println(element);
        }

    }

    /**
     * Algorithm implementation
     * @param myArray unsorted array
     */
    public static void bubbleSort(int[] myArray) {
        for (int lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    swap(myArray, i, i + 1);
                }
            }
        }
    }

    /**
     * Swap elements in the array
     */
    public static void swap(int[] array, int i, int j) {

        if (array[i] == array[j]) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
