package ru.innopolis.university.lesson1.task5;
import java.util.*;
public class Bubble {//Сортировка пузырьком
    public static void sortBubble(List<Person> person)  throws Exception {
        Person[] persons = person.toArray(new Person[100]);
        Person temp;
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if ((persons[j].getName().compareTo(persons[j + 1].getName()) > 0 &&
                        persons[j].getSex().equals(persons[j + 1].getSex()) &&
                        persons[j].getAge() == persons[j + 1].getAge()) ||
                        ((persons[j].getSex().equals(Sex.WOMAN) && (persons[j + 1].getSex().equals(Sex.MAN)) ||
                                (persons[j].getSex().equals(persons[j + 1].getSex()) &&
                                        persons[j].getAge() > persons[j + 1].getAge())))) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
                else if (persons[j].getAge() == persons[j + 1].getAge() &&
                        persons[j].getName().equals(persons[j + 1].getName())) {
                    throw new Exception("В списке есть дубликат пользователя! : " + persons[j].toString());
                }
            }
        }
        System.out.println("Сортированный массив пузырьком:");
        for (Person p : persons) {
            System.out.println(p.getAge() + " " + p.getSex() + " " + p.getName());
        }
    }
}

