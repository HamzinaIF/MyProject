package ru.innopolis.university.lesson7.task2;

import java.io.*;

public class TextGeneratorImpl implements TextGenerator {
    private ParagraphGenerator paragraphGenerator;
    private SentenceGenerator sentenceGenerator;
    private WordGenerator wordGenerator;

    @Override
    public void getFiles(String path, int n) {
        for (int i = 0; i < n; i++) {
            String text = paragraphGenerator.getParagraph(); //формируем текст из 5 абзацев
            File file = new File(path, i + " text.txt"); //создаем файл

            try {
                boolean created = file.createNewFile();
                if (created)
                    System.out.println("File has been created");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
                bw.append(text);
                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

