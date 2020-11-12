package ru.innopolis.university.lesson3;
import java.util.*;
public class Pet {
    int id;
    String nickName;
    Person owner;
    double weigh;
    Pet(int id, String nickName, Person owner, double weigh) {
        this.id = id;
        this.nickName = nickName;
        this.owner = owner;
        this.weigh = weigh;
    }
    public int getID() {
        return id;
    }
    public String getNickname() {
        return nickName;
    }
    public Person getOwner() {
        return owner;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public double getWeigh() {
        return weigh;
    }
    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }
    public static void addObject(Pet pet, List<Pet> petList) throws Exception { //метод addObject, добавляющий объект в коллекцию.
        for (Pet entryPet : petList) {
            if (entryPet.equals(pet)) {
                System.out.println(pet.toString());
                throw new Exception("Дубликат!");
            }
        }
        petList.add(pet);
    }
    public static void findPetByNickname(String petName, List<Pet> petList) { //Метод позволяет найти по имени питомца
        for (Pet pet : petList) {
            if (pet.getNickname().equals(petName)) {
                System.out.println(pet.toString());
            }
        }
    }
   public static void changeData(List<Pet> petList, int id, Person owner, int weight) { //Метод меняет данные о владельце и весе питомца
        for (Pet pet : petList) {
            if (Objects.equals(pet.getID(), id)) {
                pet.setOwner(owner);
                pet.setWeigh(weight);
            }
        }
    }
    @Override
    public String toString() {
        return ("ID: " + id
                + "; nickName: " + nickName
                + "; nickName: " + owner
                + "; weigh: " + weigh + "\n");
    }
}
