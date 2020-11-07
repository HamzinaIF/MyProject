package ru.innopolis.university.lesson2.task3;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        List<Float> nums= new ArrayList<>();
        nums.add(1, 5000f);
        nums.add(2, 200f);
        MathBox mathBox = new MathBox(nums);

        mathBox.dump();
        mathBox.addObject(20.5);
        System.out.println("После добавления  в коллекцию числа");
        mathBox.dump();
        mathBox.deleteObject(200f);
        System.out.println("После удаления из коллекции числа");
        mathBox.dump();


    }
}
