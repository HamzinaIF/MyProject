package ru.innopolis.university.lesson2.task1;
public class Main {
    public static void main(String[] args) {
        Number[] numbers = {10.0f, 3.7, 15, 2, 10};
        MathBox mathBox=new MathBox(numbers);
        System.out.println(mathBox);
        mathBox.summator();
        mathBox.splitter(6);
        mathBox.removeInt(2);
    }
}
