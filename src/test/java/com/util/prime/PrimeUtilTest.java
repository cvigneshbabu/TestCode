package com.util.prime;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class PrimeUtilTest {

    @Test
    public void testNthPrime() {
        Assertions.assertEquals(29, PrimeUtilEnum.INSTANCE.getNthPrime(10));
    }
}
