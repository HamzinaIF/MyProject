package ru.innopolis.university.lesson3;
import java.util.*;
import static ru.innopolis.university.lesson3.Pet.*;
public class Main {
    public static void main(String[] args) {
        List<Pet> petList = new ArrayList<>();
        Person owner1=new Person("Василий", 18, "мужчина");
        Person owner2=new Person("Мария", 40, "женщина");
        Person owner3=new Person("Дмитрий", 25, "мужчина");
        Person owner4=new Person("Василиса", 20, "женщина");
        Person owner5=new Person("Александр", 55, "мужчина");
        Pet pet1=new Pet(1, "Васька", owner1, 4.5);
        Pet pet2=new Pet(2, "Бруно", owner2, 10.5);
        Pet pet3=new Pet(3, "Джек", owner3, 15.5);
        Pet pet4=new Pet(4, "Маркис", owner4, 20.5);
        Pet pet5=new Pet(5, "Пушок", owner5, 5.5);
        try {
            addObject(pet1,petList);
            addObject(pet2,petList);
            addObject(pet3,petList);
            addObject(pet4,petList);
            addObject(pet5,petList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(petList.toString());
        findPetByNickname("Васька", petList);
        changeData(petList,2, owner4,40);
        System.out.println(petList.toString());
    }
}
