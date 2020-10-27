package ru.innopolis.university.lesson7.task2;
import java.util.ArrayList;
import java.util.*;

import static ru.innopolis.university.lesson7.task2.TextFileGenerator.*;


public class Main {
    public static void main(String[] args) {
        String path2 = "D:\\Users";
        List<String> myWords = new ArrayList<>();
        generateMyWords(myWords);
        makeText(7, myWords);
        getFiles(path2, 3, myWords);
    }
}
