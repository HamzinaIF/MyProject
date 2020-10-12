package ru.innopolis.university.lesson1.task3;
//Throw
public class Main {
    public static void main(String[] args) {
        String s = "Hello, world!";
        try {
            MyClass.exception(s);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
