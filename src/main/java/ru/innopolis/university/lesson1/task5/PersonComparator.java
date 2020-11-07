package ru.innopolis.university.lesson1.task5;
import java.util.*;
abstract class PersonComparator implements Comparator<Person> {//Компаратор
    public static Comparator<Person> comparator = Comparator.comparing(person -> person.getSex());
    public static Comparator<Person> comparator1 = comparator.thenComparing(person -> person.getAge());
    public static Comparator<Person> comparator2 = comparator1.thenComparing(person -> person.getName());
}
