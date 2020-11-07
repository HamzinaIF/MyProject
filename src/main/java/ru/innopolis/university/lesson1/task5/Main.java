package ru.innopolis.university.lesson1.task5;
import java.util.*;
import static ru.innopolis.university.lesson1.task5.Person.add;
public class Main {
<<<<<<< HEAD
    public static void main(String[] args) {
=======
    public static void main(String[] args) throws Exception {
>>>>>>> feature/lesson
        List<Person> person = new ArrayList<>();
        add(person);
        System.out.println("Несортированный массив:");
        for (Person p : person) {
            System.out.println(p.getAge() + " " + p.getSex() + " " + p.getName());
        }
        long start = System.nanoTime();
        person.sort(PersonComparator.comparator2);
        long finish = System.nanoTime();
        System.out.println("Время выполнения сортировкив наносекундах: " + (finish - start));
<<<<<<< HEAD
        System.out.println("Сортированный массив:");
        for (Person p : person) {
            System.out.println(p.getAge() + " " + p.getSex() + " " + p.getName());
        }
=======
        System.out.println("Сортированный массив компаратором:");
        for (Person p : person) {
            System.out.println(p.getAge() + " " + p.getSex() + " " + p.getName());
        }
        long start1 = System.nanoTime();
        Bubble bubble=new Bubble();
        bubble.sortBubble(person);
        long finish1 = System.nanoTime();
        System.out.println("Время выполнения сортировкив наносекундах: " + (finish1 - start1));
>>>>>>> feature/lesson
    }
}

