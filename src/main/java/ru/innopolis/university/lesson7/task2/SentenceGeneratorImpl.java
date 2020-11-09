package ru.innopolis.university.lesson7.task2;

import java.util.Random;

public class SentenceGeneratorImpl implements SentenceGenerator {
    private static final int QUANTITY_OF_WORDS_IN_SENTENCE = 15;
    private static final String[] PUNCTUATION_MARKS = {". ", "! ", "? "};
    private final WordGenerator wordGenerator;
    private Random random = new Random();

    public SentenceGeneratorImpl(WordGenerator wordGenerator) {
        this.wordGenerator = wordGenerator;
    }


    public static String getRandomMarks() { //Метод добавляет в конец строки знак препинания
        int n = (int) (Math.random() * 3);
        return ( PUNCTUATION_MARKS[n]);
    }

    @Override
    public StringBuilder getSentence() { //Метод формирует предложения
        StringBuilder sentence = new StringBuilder();
        String firstWord = wordGenerator.getWord().substring(0, 1).toUpperCase() + wordGenerator.getWord().substring(1).toLowerCase();
        sentence.append(firstWord);
        int sentenceQuantity = random.nextInt(QUANTITY_OF_WORDS_IN_SENTENCE);
        for (int i = 0; i <sentenceQuantity ; i++) {
            sentence.append(wordGenerator.getWord());
        }
        sentence.append(getRandomMarks());
        return (sentence);

    }



}

