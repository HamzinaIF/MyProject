package ru.innopolis.university.lesson7.task1;

import java.io.*;
import java.util.ArrayList;

public class Main {
    private static final String PATH_1 = "src/main/resources/Lesson7/notes1.txt";
    private static final String PATH_2 = "src/main/resources/Lesson7/notes2.txt";  // "../../../../resources/text.txt" (для себя, чтоб далее применять)

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();

        File file = new File(PATH_1);
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        fileReaderWriter.readWordsFromFile(file);
        fileReaderWriter.textSorter(list);
        fileReaderWriter.writeTextByPath(list,PATH_2);
    }
}

