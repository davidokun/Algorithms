package com.singletonapps.algorithms.sort;

/**
 * Selection Sort Algorithm
 *
 * Complexity = O(n^2) -> Quadratic -> Unstable
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] myArray = {20, 35, -15, 7, 55, 1, -22};

        selectionSort(myArray);

        // Just printing the sorted array
        for (int element : myArray) {
            System.out.print("\t" + element);
        }

    }

    /**
     * Selection Sort implementation
     * @param myArray unsorted array of integers
     */
    public static void selectionSort(int[] myArray) {
        for (int lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (myArray[i] > myArray[largest]) {
                    largest = i;
                }
            }

            swap(myArray, largest, lastUnsortedIndex);
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

