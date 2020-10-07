package ru.innopolis.university.hw.hw.dz3;
//Throw
public class Main {
    public static void main(String[] args) {
        String s = "Hello, world!";
        try {
            MyClass.exception(s);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Пример своего варианта ошибки через оператор throw");
        }
    }
}
