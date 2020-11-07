package ru.innopolis.university.lesson1.task5;
import java.util.*;
import static ru.innopolis.university.lesson1.task5.Person.add;
public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        add(person);
        System.out.println("Несортированный массив:");
        for (Person p : person) {
            System.out.println(p.getAge() + " " + p.getSex() + " " + p.getName());
        }
        long start = System.nanoTime();
        person.sort(PersonComparator.comparator2);
        long finish = System.nanoTime();
        System.out.println("Время выполнения сортировки в наносекундах: " + (finish - start));
        System.out.println("Сортированный массив:");
        for (Person p : person) {
            System.out.println(p.getAge() + " " + p.getSex() + " " + p.getName());
        }
    }
}

