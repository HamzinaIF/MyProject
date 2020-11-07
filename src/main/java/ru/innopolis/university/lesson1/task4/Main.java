package ru.innopolis.university.lesson1.task4;
import static ru.innopolis.university.lesson1.task4.MyClass.printNumber;
public class Main {
    public static void main(String[] args) {
        try {
            printNumber();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

