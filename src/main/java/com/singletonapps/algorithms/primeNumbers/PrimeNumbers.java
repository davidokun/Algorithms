package com.singletonapps.algorithms.primeNumbers;

/**
 * Created by David Cuellar on 15/05/2017.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * A prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself
 * Wikipedia
 */
public class PrimeNumbers {

    public static void main(String[] args) {

        /* Get first 100 prime numbers */
        List<Integer> primeNumbers = getPrimeNumbers(100);

        primeNumbers.forEach(System.out::println);

    }

    public static List<Integer> getPrimeNumbers(int maxNumber){

        List<Integer> primeNumbers = new ArrayList<>();

        for (int i=2; i < maxNumber; i++){
            if(isPrime(i)){
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    public static boolean isPrime(int n){

        for(int i=2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }





}
