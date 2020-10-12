package ru.innopolis.university.lesson1.task3;
//Мой класс
public class MyClass {
    public static void exception(String s) throws Exception {
        if ("Hello, world!".equals(s))
            throw new Exception("My Exception!");
    }
}
