package ru.innopolis.university.lesson2.task3;
import java.util.*;
public class ObjectBox <T>{
    private Collection<T> collection;

    public ObjectBox(Collection<T> collection) {
        this.collection = collection;
    }

    public ObjectBox() {
    }


    public void addObject(T object)  {
            collection.add(object);

    }
    public void deleteObject(T object) {
            collection.remove(object);

    }

    public void dump() { //метод dump, выводящий содержимое коллекции в строку.
            System.out.println(this.collection.toString());
    }

    protected Collection<T> getCollection() {
        return collection;
    }
    protected void setCollection(Collection<T> collection) {
        this.collection = collection;
    }

}