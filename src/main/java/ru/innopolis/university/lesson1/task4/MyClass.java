package ru.innopolis.university.lesson1.task4;

import java.util.*;

public class MyClass {
    public static void printNumber() throws Exception {//метод  выводит на экран те числа, у которых квадрат целой части квадратного корня равен числу
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите количество чисел: ");
            int N = in.nextInt();
            if (N < 0)
                throw new Exception("Введите положительные числа");
            System.out.print("Введите " + N + " чисел: ");
            for (int i = 0; i < N; i++) {
                int k = in.nextInt();// int k = (int) (Math.random() * (200));
                double q = Math.sqrt(k);
                if (Math.pow((int) q, 2) == k) {
                    System.out.println(q);
                }
                if (k < 0)
                    throw new Exception("Введите положительные числа");
            }
        } catch (Exception e) {
            System.out.println("Введите целое положительное число!");
        }
    }
}




