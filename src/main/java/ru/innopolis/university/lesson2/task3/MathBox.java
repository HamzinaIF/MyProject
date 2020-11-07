package ru.innopolis.university.lesson2.task3;
import java.util.*;
public class MathBox<T extends Number> extends ObjectBox<T> {

    public MathBox(List<T> nums) {//Конструктор на вход получает массив Number,элементы не повторяются и раскладываются в коллекцию
     super (new HashSet<>(nums));
    }
    public void summator() {//метод summator, возвращающий сумму всех элементов коллекции
        double sum = 0.0;
        for (Number number : getCollection()) {
            sum += number.doubleValue();
        }
        System.out.println("Sum= " +sum);
    }
    public  void splitter(double divider) {//метод splitter, выполняющий поочередное деление всех хранящихся в объекте элементов на делитель
        HashSet<Double> secondSet = new HashSet<>();
        if (divider != 0.0) {
            for (T number : getCollection()) {
                secondSet.add(number.doubleValue() / divider);
            }
            System.out.println("After splitter:");
            for (Double doubleVal : secondSet) {
                System.out.println(doubleVal);
            }
        }
    }
    public void removeInt(Integer integer) { //метод удаления integer из Hashset
        Set<T>  copySet= new HashSet<>(getCollection());//cоздали копию mySet
        for (T number : copySet) {//обход копии mySet
            if (Objects.equals(number.intValue(),integer)) {//если элемент равен integer
               getCollection().remove(number);//удаляем из mySet
            }
        }
        System.out.println("After remove integer:");
        for (Number number : getCollection()){
            System.out.println(number);
        }
    }
    @Override
    public String toString() {
        return "MathBox=" +
                getCollection();
    }
    @Override
    public void dump() { //метод dump, выводящий содержимое коллекции в строку.

            System.out.println(getCollection().toString());

    }
    @Override
    public void addObject(T object)  { //метод addObject, добавляющий объект типа T в коллекцию.
      try {
          getCollection().add(object);
      } catch (Exception e){
          System.out.println("Попытка положить Object!");
      }
           }
    @Override
    public void deleteObject(T object) { //метод deleteObject, проверяющий наличие объекта в коллекции и при наличии удаляющий его.
       getCollection().remove(object);

    }

}

