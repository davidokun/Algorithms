package com.singletonapps.algorithms.sort;

/**
 * Counting Sort Algorithm.
 *
 * Complexity = O(n) -> Linear -> Unstable
 */
public class CountingSort {

    public static void main(String[] args) {

        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };

        int[] sortedArray = countingSort(intArray, 1, 10);

        for (int anIntArray : sortedArray) {
            System.out.println(anIntArray);
        }

    }

    /**
     * Counting sort implementation
     *
     * @param input an unsorted array
     * @param min minimun value to sort
     * @param max maximun value to sort
     * @return the sorted array
     */
    private static int[] countingSort(int[] input, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;

        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }

        return input;

    }
}
