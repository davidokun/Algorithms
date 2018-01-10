package com.singletonapps.algorithms.characterCount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharactersCountTest {


    @Test
    public void shouldReturnHashedString() {
        String input = "aabb";
        String output = "a2b2";
        assertEquals(output, CharactersCount.hashString(input));

        input = "bbbaccdddd";
        output = "b3a1c2d4";
        assertEquals(output, CharactersCount.hashString(input));

        input = "aabbaccccccca";
        output = "a2b2a1c7a1";
        assertEquals(output, CharactersCount.hashString(input));
    }

    @Test
    public void shouldReturnInput() {
        String input = "abcdadfa";

        assertEquals(input, CharactersCount.hashString(input));
    }

}