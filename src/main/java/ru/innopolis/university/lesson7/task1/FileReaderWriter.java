package ru.innopolis.university.lesson7.task1;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class FileReaderWriter {
    private static final String DIVIDER = "\n";

    public List<String> readWordsFromFile(File file) throws Exception {
        final ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String word;
        while ((reader.readLine()) != null) {
            word = reader.readLine();
            list.add(word);
        }
        reader.close();
        return list;
    }

    public void textSorter(List<String> list) {
        Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));
    }

    public void writeTextByPath(List<String> text, String path) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), Charset.forName("Windows-1251")));
            for (String str : text) {
                writer.write(str + DIVIDER);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
