package ru.innopolis.university.lesson7.task2;


public class Main {
    public static void main(String[] args) {
        String PATH_2 = "D:\\Users";
        TextGenerator textGenerator = new TextGeneratorImpl();
        textGenerator.getFiles(PATH_2, 5);
    }
}
