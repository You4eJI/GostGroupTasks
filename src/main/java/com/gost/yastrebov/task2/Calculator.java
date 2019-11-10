package com.gost.yastrebov.task2;

import java.math.BigInteger;

public class Calculator {

    public BigInteger calculate(int m, int r) {
        if (m < 1)
            throw new IllegalArgumentException("'m' must be a natural number");
        if (r < 1)
            throw new IllegalArgumentException("'r' must be a natural number");
        if (r > m)
            throw new IllegalArgumentException("'r' must be less than or equal to 'm'");

        BigInteger numerator = factorial(m);
        BigInteger denominator = factorial(r).multiply(factorial(m - r));

        return numerator.divide(denominator);
    }

    private BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
