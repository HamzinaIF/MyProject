package ru.innopolis.university.lesson7.task1;
import java.io.*;
import java.util.ArrayList;
// Работа с файлами
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        String path1 = "D:\\Users\\notes1.txt";  //путь к файлу
        String path2 = "D:\\Users\\notes2.txt";
        File file = new File(path1);
        FileReaderWriter fileReaderWriter=new FileReaderWriter();
        fileReaderWriter.fileReader(file, list);
        fileReaderWriter.textSorter(list);
        fileReaderWriter.textWriter(path2, list);
    }
}

