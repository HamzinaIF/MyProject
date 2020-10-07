package ru.innopolis.university.hw.hw.dz3;
//Мой класс
public class MyClass {
    public static void exception(String s) throws Exception {
        if (s.equals("Hello, world!"))
            throw new Exception("My Exception!");
    }
}
