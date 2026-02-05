package org.example;

import java.util.stream.IntStream;

public class SumCalculator {
    public int sum(int n) throws IllegalArgumentException {
        if (n < 1){
            throw new IllegalArgumentException();
        }
        return IntStream.range(1,n + 1).sum();
    }
}
