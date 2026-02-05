package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {
    SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
         calc = new SumCalculator();
    }

    @Test
    public void testSumTo1() {
        //When
        int actual = calc.sum(1);

        //Then
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testSumTo3() {
        //When
        int actual = calc.sum(3);

        //Then
        Assertions.assertEquals(6, actual);
    }

    @Test
    public void testSumTo0() {
        //Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
    }
}
