package ru.innopolis.university.lesson7.task2;
import java.io.*;
import java.util.*;
/*
Предложение состоит из 1<=n1<=15 слов. В предложении после произвольных слов могут находиться запятые.
Слово состоит из 1<=n2<=15 латинских букв
Слова разделены одним пробелом
Предложение начинается с заглавной буквы
Предложение заканчивается (.|!|?)+" "
Текст состоит из абзацев. в одном абзаце 1<=n3<=20 предложений. В конце абзаца стоит разрыв строки и перенос каретки.
Есть массив слов 1<=n4<=1000. Есть вероятность probability вхождения одного из слов этого массива в следующее предложение (1/probability).
Необходимо написать метод getFiles(String path, int n, int size, String[] words, int probability), который создаст n файлов размером size
в каталоге path. words - массив слов, probability - вероятность.
 */
public class TextFileGenerator {
    private static final int quantityOfSentenceInParagraph = 20;
    private static final int quantityOfWordsInSentence = 15;

    public static void generateMyWords(List list) {//Метод формирует массив слов из файла
        String path1 = "D:\\Users\\words.txt";  //путь к файлу со словами
        File file1 = new File(path1);
        try {
            Scanner scan = new Scanner(file1);//считываем из файла слова
            while (scan.hasNext()) {   //пока есть, что считывать
                String name = scan.nextLine();  //считываем 1 строку
                list.add(name); //добавляем в список слов
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static String getRandomItem(List<String> list) //метод выбирает рандомное слово
    {
        Random random = new Random();
        int listSize = list.size();
        int randomIndex = random.nextInt(listSize);
        String s = list.get(randomIndex);
        return s;
    }
    public static String getRandomMarks() { //Метод добавляет в конец строки знак препинания
        String[] punctuationMarks = {". ", "! ", "? "};
        int n = (int) (Math.random() * 3);
        return (punctuationMarks[n]);
    }
    public static void makeSentence(List<String> list) { //Метод формирует предложения
        StringBuilder sentence = new StringBuilder();
        String firstWord;
        firstWord = getRandomItem(list).substring(0, 1).toUpperCase();
        sentence.append(firstWord);
        for (int i = 0; i < quantityOfWordsInSentence; i++) {
            sentence.append(getRandomItem(list));
        }
        sentence.append(getRandomMarks());
        System.out.print(sentence);
    }
    public static void makeParagraph(List<String> list) { //Метод формирует абзацы
        for (int i = 0; i < quantityOfSentenceInParagraph; i++) {
            makeSentence(list);
        }
        System.out.println("\r \n");
    }
    public static String makeText(int size, List<String> list) {
        for (int i = 0; i < size; i++) {
            makeParagraph(list);
        }
        return null;
    }
    public static void getFiles(String path, int n, List<String> list) {//создаст n файлов размером size
        // в каталоге path. words - массив слов, probability - вероятность.
        for (int i = 0; i < n; i++) {
            String text = makeText(5, list); //формируем текст из 5 абзацев

            File file = new File(path, i+ " text.txt"); //создаем файл

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