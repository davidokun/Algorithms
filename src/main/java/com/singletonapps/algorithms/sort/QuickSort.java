package com.singletonapps.algorithms.sort;

/**
 * Quick Sort Algorithm. Use pivot to divide array into lef and right.
 *
 * Complexity = O(n log n) -> Logarithmic -> Unstable -> Inplace algorithm.
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        quickSort(intArray, 0, intArray.length);

        for (int anIntArray : intArray) {
            System.out.print(anIntArray + " ");
        }
    }

    /**
     * Quick Sort implementation
     * @param input an unsorted array
     * @param start beginning of the array
     * @param end end of the array
     */
    private static void quickSort(int[] input, int start, int end) {

        // If input has only one element
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {

        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            while (i < j && input[--j] >= pivot) {
                continue;
            }
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot) {
                continue;
            }
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
