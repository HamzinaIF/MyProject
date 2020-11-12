package ru.innopolis.university.lesson2.task3;
import java.util.*;
public class MathBox<T extends Number> extends ObjectBox<T> {


    public MathBox(T[] arrayNumbers) {
        Set<T> mySet = new HashSet<T>();
        Collections.addAll(mySet, arrayNumbers);
        List<T> myList= new ArrayList<>(mySet);
        setCollection(myList);
    }
    public void summator() {
        double sum = 0.0;
        for (Number number : getCollection()) {
            sum += number.doubleValue();
        }
        System.out.println("Sum of numbers= " + sum);
    }
    public  void splitter(double divider) {
        if (divider != 0.0) {
            List<Number> list = (List<Number>) getCollection();
            for (int i = 0; i < getCollection().size(); i++) {
               list.set(i, list.get(i).doubleValue() / divider);
            }
            System.out.println("After splitter 10:");
            }
        }

    public void removeInt(Integer integer) {
        getCollection().remove(integer);
        System.out.println("After remove integer 10:");

        }

    @Override
    public String toString() {
        return "MathBox=" +
                getCollection();
    }
    @Override
    public void dump() {

            System.out.println(getCollection().toString());

    }
    @Override
    public void addObject(T object)  {
      try {
          getCollection().add(object);
      } catch (Exception e){
          System.out.println("Попытка положить Object!");
      }
           }
    @Override
    public void deleteObject(T object) {
       getCollection().remove(object);

    }

}

