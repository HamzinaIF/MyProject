package ru.innopolis.university.lesson2.task2;
import java.util.*;
public class ObjectBox {
    public final Collection<Object> collection; //класс ObjectBox, который будет хранить коллекцию Object.
    public ObjectBox(Collection<Object> collection) {
        this.collection = collection;
    }
    public void addObject(Object object) { //метод addObject, добавляющий объект в коллекцию.
        collection.add(object);
    }
    public void deleteObject(Object object) { //метод deleteObject, проверяющий наличие объекта в коллекции и при наличии удаляющий его.
       collection.remove(object);
    }
    public void dump() { //метод dump, выводящий содержимое коллекции в строку.
        System.out.println(collection.toString());
    }
}