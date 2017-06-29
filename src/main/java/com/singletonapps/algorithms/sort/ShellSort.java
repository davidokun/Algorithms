package com.singletonapps.algorithms.sort;

/**
 * Shell Sort Algorithm (Improves on Insertion Sort (less shifting))
 *
 * Complexity = O(n^2) -> Quadratic -> Unstable
 */
public class ShellSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        shellSort(intArray);

        // Just printing the array
        for (int element : intArray) {
            System.out.print(element + " ");
        }

    }

    /**
     * Shell Sort implementation
     * @param intArray an unsorted int array
     */
    static void shellSort(int[] intArray) {

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {

                int newElement = intArray[i];
                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }
    }
}
