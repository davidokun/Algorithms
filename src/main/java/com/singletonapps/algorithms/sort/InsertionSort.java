package com.singletonapps.algorithms.sort;

/**
 * Insertion Sort Algorithm
 *
 * Complexity = O(n^2) -> Quadratic -> Stable
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] myArray = {20, 35, -15, 7, 55, 1, -22};

        insertionSort(myArray);

        for (int element : myArray) {
            System.out.print(element + "\t");
        }

    }

    /**
     * Insertion Sort implementation
     * @param myArray an unsorted int array
     */
    public static void insertionSort(int[] myArray) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < myArray.length; firstUnsortedIndex++) {

            int newElement = myArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && myArray[i - 1] > newElement; i--) {
                myArray[i] = myArray[i - 1];
            }

            myArray[i] = newElement;
        }
    }
}
