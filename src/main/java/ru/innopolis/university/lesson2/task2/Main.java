package ru.innopolis.university.lesson2.task2;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<Object> objects= new ArrayList<>();
        ObjectBox objectBox = new ObjectBox(objects);
        objectBox.addObject(2);
        objectBox.addObject(52);
        objectBox.dump();
        Set<String> products= new HashSet<>();
        products.add("Яблоко");
        products.add("Мандарин");
        products.add("Апельсин");
        products.add("Виноград");
        objectBox.addObject(products);
        objectBox.dump();
        objectBox.deleteObject(2);
        objectBox.addObject(52);
        objectBox.dump();
    }
}
