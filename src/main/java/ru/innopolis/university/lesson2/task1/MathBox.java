package ru.innopolis.university.lesson2.task1;

import java.util.*;

public class MathBox<T extends Number> {
    private final Set<T> mySet = new HashSet<T>();
    private List<Number> myList;

    public MathBox(T[] arrayNumbers) {
        Collections.addAll(mySet, arrayNumbers);
        myList = (List<Number>) new ArrayList<>(mySet);
    }

    public void summator() {
        double sum = 0.0;
        for (Number number : mySet) {
            sum += number.doubleValue();
        }
        System.out.println("Sum= " + sum);
    }

    public void splitter(double divider) {
        if (divider != 0.0) {
            for (int i = 0; i < myList.size(); i++) {
                myList.set(i, myList.get(i).doubleValue() / divider);
            }
            System.out.println("After splitter 10:");
            System.out.println(myList.toString());

        }
    }

    public void removeInt(Integer integer) {
        myList.remove(integer);
        System.out.println("After remove integer 10:");

        System.out.println(myList.toString());
    }

    @Override
    public String toString() {
        return "MathBox=" +
                mySet;
    }
}

