package ru.innopolis.university.lesson8;

import java.math.BigInteger;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class FactorialCalc implements Callable<BigInteger> {
    private final int number;

    public ConcurrentHashMap<Integer, BigInteger> factorialsOfNumbers = new ConcurrentHashMap<>();

    public FactorialCalc(int number) {
        this.number = number;
    }

    @Override
    public BigInteger call() {

        BigInteger res = BigInteger.valueOf(1);
        for (int i = 2; i <= number; i++) {
            res = res.multiply(new BigInteger(String.valueOf(i)));
        }
        return res;
    }
}
