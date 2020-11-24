package ru.innopolis.university.lesson10;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {

    public static final String PATH = "src/main/java/ru/innopolis/university/lesson10/SomeClass.java";

    public static void main(String[] args) {

        System.out.println("метод doWork:");
        SomeClass sc = new SomeClass();
        sc.doWork();

        System.out.println("Введите код метода doWork!");
        createMyClassAndCompile();

        System.out.println("Загрузка моего класса и выполнения метода doWork");
        try {
            SomeClassLoader loader = new SomeClassLoader();
            Class<?> cls = loader.loadClass("SomeClass");
            cls.getMethod("doWork").invoke(cls.newInstance());
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void createMyClassAndCompile() {
        File source = new File(PATH);
        source.getParentFile().mkdirs();
        try {
            Files.writeString(source.toPath(), writeMethod());
        } catch (IOException e) {
            e.printStackTrace();
        }
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        compiler.run(null, null, null, source.getPath());
    }

    private static String writeMethod() {
        Scanner in = new Scanner(System.in);
        String tmp = in.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append("package ru.innopolis.university.lesson10;\n\npublic class SomeClass implements Worker {\n\n\tpublic SomeClass(){}  \n\n\t@Override\n\tpublic void doWork() {\n");
        while (!tmp.isEmpty()) {
            sb.append("\t\t").append(tmp).append("\n");
            tmp = in.nextLine();
        }
        sb.append("\t}\n}");
        return sb.toString();
    }
}