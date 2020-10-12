package ru.innopolis.university.lesson1.task2;
//NullPointerException
public class Main {
    public static void main(String[] args) {
        Hello hello = null;
        try {
            hello.hello();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
