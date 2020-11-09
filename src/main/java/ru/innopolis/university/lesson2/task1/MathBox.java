package ru.innopolis.university.lesson2.task1;
import java.util.*;
public class MathBox<T extends Number> {
    private  final   Set<T> mySet = new HashSet<T>();
    public MathBox(T[] arrayNumbers) {//Конструктор на вход получает массив Number,элементы не повторяются и раскладываются в коллекцию
        Collections.addAll(mySet, arrayNumbers);
    }
    public void summator() {//метод summator, возвращающий сумму всех элементов коллекции
        double sum = 0.0;
        for (Number number : mySet) {
            sum += number.doubleValue();
        }
        System.out.println("Sum= " +sum);
    }
    public  void splitter(double divider) {//метод splitter, выполняющий поочередное деление всех хранящихся в объекте элементов на делитель
        HashSet<Double> secondSet = new HashSet<>();
        if (divider != 0.0) {
            for (Number number : mySet) {
                secondSet.add(number.doubleValue() / divider);
            }
            System.out.println("After splitter:");
            for (Number number : secondSet) {
                System.out.println(number);
            }
        }
    }
    public void removeInt(Integer integer) { //метод удаления integer из Hashset
        Set<T>  copySet= new HashSet<T>(mySet);//cоздали копию mySet
        for (Number number : copySet) {//обход копии mySet
            if (Objects.equals(number.intValue(),integer)) {//если элемент равен integer
                mySet.remove(number);//удаляем из mySet
            }
        }
        System.out.println("After remove integer:");
        for (Number number : mySet){
            System.out.println(number);
        }
    }
    @Override
    public String toString() {
        return "MathBox=" +
                 mySet;
    }
}

