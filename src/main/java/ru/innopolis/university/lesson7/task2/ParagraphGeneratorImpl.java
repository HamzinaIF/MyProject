package ru.innopolis.university.lesson7.task2;
import java.util.*;



public class ParagraphGeneratorImpl implements ParagraphGenerator {
    private static final int QUANTITY_OF_SENTENCE_IN_PARAGRAPH = 20;
    private Random random = new Random();
    private final SentenceGenerator sentenceGenerator;
    public  ParagraphGeneratorImpl(SentenceGenerator sentenceGenerator){
        this.sentenceGenerator=sentenceGenerator;
    }

    @Override
    public String getParagraph() {
        int sentenceQuantity = random.nextInt(QUANTITY_OF_SENTENCE_IN_PARAGRAPH) + 1;
        for (int i = 0; i < sentenceQuantity; i++) {
            sentenceGenerator.getSentence();
        }
        System.out.println("\r \n");
        return null;
    }
}
