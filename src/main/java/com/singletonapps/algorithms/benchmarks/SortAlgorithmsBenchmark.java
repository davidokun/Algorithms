package com.singletonapps.algorithms.benchmarks;

import com.singletonapps.algorithms.sort.MergeSort;
import com.singletonapps.algorithms.sort.QuickSort;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class SortAlgorithmsBenchmark {

    @State(Scope.Thread)
    public static class MyState {
        public  int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
    }


    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public int[] testMergeSort(MyState state) {
        return MergeSort.mergeSort(state.intArray, 0, state.intArray.length);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public int[] testQuickSort(MyState state) {
        return QuickSort.quickSort(state.intArray, 0, state.intArray.length);
    }
}
