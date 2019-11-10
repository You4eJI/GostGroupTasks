package com.gost.yastrebov.task2;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class TestCalculator {
    private Calculator calculator;

    @Test(expected = IllegalArgumentException.class)
    public void bothNumbersZero(){
        calculator = new Calculator();
        calculator.calculate(0,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void bothNumbersNegative(){
        calculator = new Calculator();
        calculator.calculate(-1,-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void secondNumberBiggerThanFirst() {
        calculator = new Calculator();
        calculator.calculate(3,5);
    }

    @Test
    public void equalNumbers() {
        calculator = new Calculator();
        Assert.assertEquals(BigInteger.ONE, calculator.calculate(3,3));
    }

    @Test
    public void firstNumberBiggerThanSecond(){
        calculator = new Calculator();
        Assert.assertEquals(BigInteger.valueOf(35), calculator.calculate(7,3));
    }
}
