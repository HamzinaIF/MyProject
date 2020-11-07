package ru.innopolis.university.lesson1.task5;
import java.io.*;
import java.util.*;
//Массив Person
public class Person { //Класс Person
    int age;
    String sex;
    String name;
    public Person(int age, String sex, String name) {//конструктор
        this.age = age;
        this.sex = sex;
        this.name = name;
    }
    public int getAge() {
        return age;
    }//метод возвращает возраст
    public String getSex() {
        return sex;
    }//метод возвращает пол
    public String getName() {
        return name;
    }//метод возвращает имя
    public static int setAge() { //метод заполняет рандомными значениями "Возраст"
        int random_age = (int) (Math.random() * 100); // генерация числа
        return random_age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else if (obj == null)
            return false;
        else if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        else if (sex != other.sex)
            return false;
        else if (name != other.name)
            return false;
        return true;
    }
    public static  <T> T getRandomItem(List<T> list) //дженерик выбирает рандомное значение из листа
    {
        Random random = new Random();
        int listSize = list.size();
        int randomIndex = random.nextInt(listSize);
        return list.get(randomIndex);
    }
    public static String setName(String sex) {//Метод заполняет рандомными значениями "Имя"
        String path1 = "D:\\Users\\man.txt";  //путь к файлу с мужскими именами
        String path2 = "D:\\Users\\woman.txt";  //путь к файлу с женскими именами
        File file1 = new File(path1);
        File file2 = new File(path2);
        List<String> manList = new ArrayList<>();
        List<String> womanList = new ArrayList<>();
        try {
            Scanner scan = new Scanner(file1);//считываем из файла мужских имен
            while (scan.hasNext()) {   //пока есть, что считывать
                String name = scan.nextLine();  //считываем 1 строку
                manList.add(name); //добавляем в список мужских имен
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        try {
            Scanner scan = new Scanner(file2);//считываем из файла женских имен
            while (scan.hasNext()) {   //пока есть, что считывать
                String name = scan.nextLine();  //считываем 1 строку
                womanList.add(name); // добавляем в список женских имен
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (sex.equals("Man")) {
            return (getRandomItem(manList));
        } else
            return (getRandomItem(womanList));
    }
    public static String setSex() { //Метод заполняет рандомными значениями "Пол"
        String[] sex = {"Man", "Woman"};
        int n = (int) (Math.random() * 2);
        return (sex[n]);
    }
    public static void add(List person) {
        for (int i = 0; i < 100; i++) {
            int age = Person.setAge();
            String sex = Person.setSex();
            String name = Person.setName(sex);
            person.add(new Person(age, sex, name));
        }
    }
}
