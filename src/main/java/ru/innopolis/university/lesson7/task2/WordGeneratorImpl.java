package ru.innopolis.university.lesson7.task2;

import java.io.*;
import java.util.*;

public class WordGeneratorImpl implements WordGenerator {
    private static final String PATH = "src/main/resources/Lesson7/words.txt";
    private List<String> words = new ArrayList<>();
    public  WordGeneratorImpl() {

        File file1 = new File(PATH);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file1));
            String name;
            while ((reader.readLine()) != null) {
                name = reader.readLine();
                words.add(name);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getWord() {
        return words.get(new Random().nextInt(words.size()));
    }
}
