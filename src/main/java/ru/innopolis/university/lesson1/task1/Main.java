package ru.innopolis.university.lesson1.task1;
//ArrayIndexOutOfBoundsException
public class Main {
    public static void main(String[] args) {
        String[] array = {"Hello", ", ", "world", "!"};
        try {
            for (int i = -1; i < 4; i++) {
                System.out.print(array[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
