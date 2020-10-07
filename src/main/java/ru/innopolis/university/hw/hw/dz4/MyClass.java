package ru.innopolis.university.hw.hw.dz4;
import java.util.*;
public class MyClass {
    public static void  printNumber( ) throws Exception {//метод  выводит на экран те числа, у которых квадрат целой части квадратного корня равен числу
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int N = in.nextInt();
        System.out.print("Введите "+N+" чисел: ");
        for (int i = 0; i < N; i++) {
            int k = in.nextInt();// int k = (int) (Math.random() * (200));
            double q=Math.sqrt(k);
            if (Math.pow((int)q, 2)==k){
                System.out.println(q);
            }
            if (k < 0)
                throw new Exception("Введите положительные числа");
        }
    }
}




