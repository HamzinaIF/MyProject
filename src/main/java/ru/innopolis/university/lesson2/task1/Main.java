package ru.innopolis.university.lesson2.task1;

public class Main {
    public static void main(String[] args) {
        Number[] numbers = {10.0, 3.7, 15, 2, 10, 1000};
        MathBox mathBox = new MathBox(numbers);
        System.out.println(mathBox);
        mathBox.summator();
        mathBox.removeInt(10);
        mathBox.splitter(10);
    }
}
