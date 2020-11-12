package ru.innopolis.university.lesson8;

import java.math.BigInteger;
import java.util.*;
import java.util.Random;
import java.util.concurrent.*;

public class FactorialCalculateDemo {
    public static void main(String[] args) {
        final List<Integer> integerList = new ArrayList<>();
        final ExecutorService executorService = Executors.newFixedThreadPool(10);
        final List<Future<BigInteger>> results = new ArrayList<>();
        final Random random = new Random();
        for (int i = 0; i < 10; i++) {
            final int nextInt = random.nextInt(1000);
            integerList.add(nextInt);

        }
        System.out.println("Массив случайных чисел: " + integerList);
        integerList.forEach(val -> {
            final Future<BigInteger> future = executorService.submit(new FactorialCalc(val));
            results.add(future);
        });
        results.forEach(future -> {
            try {
                final BigInteger bigInteger = future.get();
                System.out.println(bigInteger);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
    }
}
