package ru.innopolis.university.lesson2.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Number[] myNumber = {10.0, 3.7, 15, 2, 10, 1000};
        MathBox mathBox = new MathBox<>(myNumber);
        mathBox.dump();
        mathBox.summator();
        mathBox.removeInt(10);
        mathBox.dump();
        mathBox.splitter(10);
        mathBox.dump();
        mathBox.addObject(555);
        System.out.println("Add to MathBox 555:");
        mathBox.dump();
        ObjectBox objectBox = new ObjectBox();
        List<String> myList = new ArrayList<>();
        myList.add("Виноград");
        myList.add("Апельсин");
        myList.add("Мандарин");
        objectBox.setCollection(myList);
        System.out.println("My ObjectBox:");
        objectBox.dump();
        objectBox.addObject("Груша");
        System.out.println("Add Груша:");
        objectBox.dump();
        objectBox.deleteObject("Виноград");
        System.out.println("Remove виноград:");
        objectBox.dump();

    }
}
