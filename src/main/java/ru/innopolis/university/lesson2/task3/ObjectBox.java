package ru.innopolis.university.lesson2.task3;
import java.util.*;
public class ObjectBox <T>{
    private final Collection<T> collection; //класс ObjectBox, который будет хранить коллекцию Object.


    public ObjectBox(Collection<T> collection) {
        this.collection = collection;
    }


    public void addObject(T object)  { //метод addObject, добавляющий объект типа T в коллекцию.
            collection.add(object);

    }
    public void deleteObject(T object) { //метод deleteObject, проверяющий наличие объекта в коллекции и при наличии удаляющий его.
            collection.remove(object);

    }

    public void dump() { //метод dump, выводящий содержимое коллекции в строку.
            System.out.println(this.collection.toString());
    }

    protected Collection<T> getCollection() {
        return collection;
    }


}