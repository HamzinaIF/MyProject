package ru.innopolis.university.lesson7.task1;
import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class FileReaderWriter {

    public void fileReader(File file, List list) throws Exception {
        Scanner scan = new Scanner(file); //считываем из файла
        while (scan.hasNext()) {   //пока есть, что считывать
            String word = scan.next();  //считываем 1 строку
            list.add(word);
        }
        scan.close();
    }

    public void textSorter(List list) {
        Set<String> set = new HashSet<>(list); //удаляем повторяющиеся слова
        list.clear();
        list.addAll(set);
        Collections.sort(list, new Comparator<String>() { //сортируем
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });
    }

    public void textWriter(String path2, List<String> list) {
        try {
            BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path2), Charset.forName("Windows-1251")));
            for (String el : list)
                bw2.write(el + "\n");
            bw2.close();  //закрыли поток
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
