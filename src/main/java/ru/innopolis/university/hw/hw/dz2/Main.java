package ru.innopolis.university.hw.hw.dz2;
//NullPointerException
public class Main {
    public static void main(String[] args) {
        Hello hello = null;
        try {
            hello.hello();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Пример ошибки NullPointerException");
        }
    }
}
