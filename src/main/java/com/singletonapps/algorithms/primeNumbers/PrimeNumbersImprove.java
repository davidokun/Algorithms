package com.singletonapps.algorithms.primeNumbers;

import java.util.stream.IntStream;

/**
 * Created by David Cuellar on 15/05/2017.
 */
public class PrimeNumbersImprove {

    public static void main(String[] args) {

        /* Get first 100 prime numbers */
        IntStream numbers = IntStream.rangeClosed(2, 100);

        numbers.filter(PrimeNumbersImprove::isPrime)
                .forEach(System.out::println);

    }

    public static boolean isPrime(int n){

        IntStream numbers = IntStream.range(2, n);

        return numbers.noneMatch(x -> n % x == 0);
    }


}
