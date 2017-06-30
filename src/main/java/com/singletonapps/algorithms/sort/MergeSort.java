package com.singletonapps.algorithms.sort;

/**
 * Merge Sort Algorithm. Sub-divide array in smaller sorted arrays, then merge it up
 *
 * Complexity = O(n log n) -> Logarithmic -> Stable
 */
public class MergeSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        for (int anIntArray : intArray) {
            System.out.print(anIntArray + " ");
        }

    }

    /**
     * Merge Sort implementation
     * @param input an unsorted int array
     * @param start beginning of the array
     * @param end end of the array
     */
    private static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        /* Splitting phase */
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);

        /* Merge phase */
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
