package com.singletonapps.algorithms.primeNumbers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by David Cuellar on 15/05/2017.
 */
public class PrimeNumbersTest {

    @InjectMocks
    private PrimeNumbers primeNumbers;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void getPrimeNumbers() throws Exception {

        List<Integer> primes = PrimeNumbers.getPrimeNumbers(100);

        assertNotNull(primes);
        assertSame(37, primes.get(11));
    }


}